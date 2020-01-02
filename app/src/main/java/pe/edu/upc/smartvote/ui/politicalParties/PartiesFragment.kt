package pe.edu.upc.smartvote.ui.politicalParties

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.smartvote.R
import pe.edu.upc.smartvote.networking.cache.CacheList

class PartiesFragment : Fragment() {

    private lateinit var partiesViewModel: PartiesViewModel
    private lateinit var partiesRecyclerView: RecyclerView
    private lateinit var partiesAdapter: RecyclerView.Adapter<*>
    private lateinit var partiesLayoutManager: RecyclerView.LayoutManager
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        partiesViewModel =
            ViewModelProviders.of(this).get(PartiesViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_parties, container, false)
        val textView: TextView = root.findViewById(R.id.text_parties)
        partiesRecyclerView = root.findViewById(R.id.recycler_view_parties)
        partiesLayoutManager = GridLayoutManager(this.context, 2)
        val cacheMemory: CacheList = this.context?.applicationContext as CacheList
        val politicalParties = cacheMemory.objects
        partiesAdapter = PartiesAdapter(politicalParties, this.context!!)
        partiesRecyclerView.adapter = partiesAdapter
        partiesRecyclerView.layoutManager = partiesLayoutManager
        partiesViewModel.text.observe(this, Observer {
            textView.text = it
        })
        if (politicalParties.isEmpty()) {
            textView.visibility = View.VISIBLE
        } else {
            textView.visibility = View.GONE
        }
        return root
    }
}