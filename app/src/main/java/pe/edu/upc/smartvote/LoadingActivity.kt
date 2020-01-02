package pe.edu.upc.smartvote

import android.app.Activity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import pe.edu.upc.smartvote.networking.cache.CacheList
import pe.edu.upc.smartvote.networking.firebase.FireStoreUtil
import pe.edu.upc.smartvote.repository.model.PoliticalParty

class LoadingActivity : AppCompatActivity() {
    private lateinit var politicalPartiesList: ArrayList<PoliticalParty>
    private val fireStoreUtil = FireStoreUtil()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)
        politicalPartiesList = ArrayList()


        fireStoreUtil.signIn()

        FireStoreUtil.db.collection("partidos")
            .get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    for (document in task.result!!) {
                        Log.d("FireStore Read", "${document.id} => ${document.data}")
                        val politicalParty = document.toObject(PoliticalParty::class.java)
                        politicalPartiesList.add(politicalParty)
                    }
                    val cacheMemory: CacheList = applicationContext as CacheList
                    cacheMemory.objects = politicalPartiesList
                    setResult(Activity.RESULT_OK)
                    finish()
                } else {
                    Log.w("FireStore Error", task.exception)
                    setResult(Activity.RESULT_CANCELED)
                    finish()
                }
            }
    }
}
