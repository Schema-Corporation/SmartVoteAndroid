package pe.edu.upc.smartvote.ui.politicalParties

import android.content.Context
import android.content.Intent
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DataSource
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.engine.GlideException
import com.bumptech.glide.request.RequestListener
import com.bumptech.glide.request.target.Target
import com.github.ybq.android.spinkit.sprite.Sprite
import com.github.ybq.android.spinkit.style.FadingCircle
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
        val fadingAnimation: Sprite = FadingCircle()
        holder.loadingAnimation.indeterminateDrawable = fadingAnimation

        Glide
            .with(holder.itemView)
            .load(party.url_photo)
            .override(415, 415)
            .fitCenter()
            .error(R.drawable.ic_launcher_background)
            .listener(object : RequestListener<Drawable> {
                override fun onLoadFailed(
                    e: GlideException?,
                    model: Any?,
                    target: Target<Drawable>?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.loadingAnimation.visibility = View.GONE
                    return false
                }

                override fun onResourceReady(
                    resource: Drawable?,
                    model: Any?,
                    target: Target<Drawable>?,
                    dataSource: DataSource?,
                    isFirstResource: Boolean
                ): Boolean {
                    holder.loadingAnimation.visibility = View.GONE
                    return false
                }
            })
            .diskCacheStrategy(DiskCacheStrategy.DATA)
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