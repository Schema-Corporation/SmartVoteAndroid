package pe.edu.upc.smartvote.ui.politicalParties

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import pe.edu.upc.smartvote.R
import pe.edu.upc.smartvote.repository.model.PoliticalParty
import pe.edu.upc.smartvote.ui.candidates.CandidatesActivity

class PartiesAdapter(var list: List<PoliticalParty>, val context: Context) :
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
        val party = list[position]
        Glide
            .with(holder.itemView)
            .load(party.url_photo)
            .centerCrop()
            .placeholder(R.drawable.ic_group_black_24dp)
            .error(R.drawable.ic_launcher_background)
            .fallback(R.drawable.ic_launcher_background)
            .into(holder.profileImage)
        holder.profileTitle.text = party.nombre
        holder.profileImage.setOnClickListener {
            val intent = Intent(this.context, CandidatesActivity::class.java)
            intent.putExtra("partyName", party.nombre)
            this.context.startActivity(intent)
        }
    }
}