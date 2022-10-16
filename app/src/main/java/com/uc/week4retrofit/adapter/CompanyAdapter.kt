package com.uc.week4retrofit.adapter
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.uc.week4retrofit.R
import com.uc.week4retrofit.helper.Const
import com.uc.week4retrofit.model.ProductionCompany
import com.uc.week4retrofit.model.Result
import com.uc.week4retrofit.view.MovieDetail

class CompanyAdapter(private val dataSet: List<ProductionCompany>) :
    RecyclerView.Adapter<CompanyAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imgset: ImageView

        init {
            // Define click listener for the ViewHolder's View.
            imgset = view.findViewById(R.id.imgcompay)
        }
    }

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.card_listlogocompany, viewGroup, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        Glide.with(viewHolder.itemView).load(Const.IMG_URL + dataSet[position].logo_path)
            .into(viewHolder.imgset)
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = dataSet.size

}