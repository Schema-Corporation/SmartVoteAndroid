package pe.edu.upc.smartvote.ui.candidates

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import pe.edu.upc.smartvote.R

class CandidatesActivity : AppCompatActivity() {

    private var candidateList: List<String> = ArrayList()
    private lateinit var candidateEmptyText: TextView
    private lateinit var partyName: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_candidates)
        candidateEmptyText = findViewById(R.id.text_candidates)
        partyName = intent.getStringExtra("partyName") as String
        if (candidateList.isEmpty()) {
            candidateEmptyText.text = "No candidates have been registered for $partyName"
            candidateEmptyText.visibility = View.VISIBLE
        } else {
            candidateEmptyText.visibility = View.GONE
        }
    }
}
