package pe.edu.upc.smartvote.ui.candidates

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import pe.edu.upc.smartvote.R

class CandidatesFragment : Fragment() {

    private lateinit var candidatesViewModel: CandidatesViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        candidatesViewModel =
            ViewModelProviders.of(this).get(CandidatesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_candidates, container, false)
        val textView: TextView = root.findViewById(R.id.text_candidates)
        candidatesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}