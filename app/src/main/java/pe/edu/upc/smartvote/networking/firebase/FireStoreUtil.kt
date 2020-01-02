package pe.edu.upc.smartvote.networking.firebase

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.FirebaseFirestore
import pe.edu.upc.smartvote.repository.model.PoliticalParty

class FireStoreUtil {
    companion object {
        var db = FirebaseFirestore.getInstance()
        var auth = FirebaseAuth.getInstance()
    }

    fun signIn() {
        if (auth.currentUser != null) {
            return
        } else {
            auth.signInAnonymously().addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    Log.d("FireBase Authentication", "SignIn Success")
                } else {
                    Log.w("FireBase Authentication Error", "SignIn Failed", task.exception)
                }
            }
        }
    }

    fun readCollection(): ArrayList<PoliticalParty> {
        val politicalPartyList = ArrayList<PoliticalParty>()
        signIn()
        db.collection("partidos")
            .get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    for (document in task.result!!) {
                        Log.d("FireStore Read", "${document.id} => ${document.data}")
                        val politicalParty = document.toObject(PoliticalParty::class.java)
                        politicalPartyList.add(politicalParty)
                    }
                } else {
                    Log.w("FireStore Error", task.exception)
                }
            }
        return politicalPartyList
    }
}
