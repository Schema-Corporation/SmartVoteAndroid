package pe.edu.upc.smartvote.ui.politicalParties

import android.view.View
import android.widget.ProgressBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mikhaellopez.circularimageview.CircularImageView
import pe.edu.upc.smartvote.R

class PartiesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var profileImage: CircularImageView = itemView.findViewById(R.id.profileImage)
    var profileTitle: TextView = itemView.findViewById(R.id.profileText)
    var loadingAnimation: ProgressBar = itemView.findViewById(R.id.loadingAnimationParties)
}