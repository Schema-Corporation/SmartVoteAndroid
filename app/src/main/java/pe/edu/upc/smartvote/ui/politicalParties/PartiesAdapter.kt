package pe.edu.upc.smartvote.ui.politicalParties

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.upc.smartvote.R
import pe.edu.upc.smartvote.ui.candidates.CandidatesActivity

class PartiesAdapter(var list: List<String>, val context: Context) :
    RecyclerView.Adapter<PartiesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PartiesViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.candidates_list_view_holder, parent, false)
        return PartiesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: PartiesViewHolder, position: Int) {
        holder.profileImage.setImageResource(R.drawable.ic_group_black_24dp)
        holder.profileTitle.text = list[position]
        holder.profileImage.setOnClickListener {
            val intent = Intent(this.context, CandidatesActivity::class.java)
            intent.putExtra("partyName", list[position])
            this.context.startActivity(intent)
        }
    }
}