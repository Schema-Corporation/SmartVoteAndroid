package pe.edu.upc.smartvote

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*
import pe.edu.upc.smartvote.networking.cache.CacheList

class MainActivity : AppCompatActivity() {
    private val LOAD_PARTY_LIST_REQUEST = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val loadingIntent = Intent(this@MainActivity, LoadingActivity::class.java)
        startActivityForResult(loadingIntent, LOAD_PARTY_LIST_REQUEST)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == LOAD_PARTY_LIST_REQUEST) {
            if (resultCode == Activity.RESULT_OK) {
                val mainIntent = Intent(this@MainActivity, NavigationActivity::class.java)
                val cacheMemory = applicationContext as CacheList
                cacheMemory.objects
                startActivity(mainIntent)
                finish()
            } else {
                val errorSnackBar = Snackbar.make(
                    this.textPlaceHolder,
                    "No se pudo cargar la lista de candidatos :(",
                    Snackbar.LENGTH_INDEFINITE
                )
                errorSnackBar.setAction(
                    "Reintentar"
                ) { recreate() }
                errorSnackBar.show()
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }
}
