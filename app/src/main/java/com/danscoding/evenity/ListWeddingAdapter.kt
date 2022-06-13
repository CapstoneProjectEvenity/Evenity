package com.danscoding.evenity

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class ListWeddingAdapter(private val listWeddingList : List<ListWedding>) : RecyclerView.Adapter<ListWeddingAdapter.ListWeddingViewHolder>() {
    class ListWeddingViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        val listTeamImageProfile : CircleImageView = itemView.findViewById(R.id.circleProfileImageView)
        val listNameTeam : TextView = itemView.findViewById(R.id.textViewListNameTeam)
        val listCategoryTeam : TextView = itemView.findViewById(R.id.textViewListCategoriesTeam)
        val listImageTeam : ImageView = itemView.findViewById(R.id.imageViewListTeam)
        val listPriceTeam : TextView = itemView.findViewById(R.id.priceListTeam)
        val listRatingTeam : TextView = itemView.findViewById(R.id.textViewListRating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListWeddingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_row_list_team, parent, false)
        return ListWeddingAdapter.ListWeddingViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListWeddingViewHolder, position: Int) {
        val listwedding = listWeddingList[position]
        holder.listTeamImageProfile.setImageResource(listwedding.listProfileImage)
        holder.listNameTeam.text = listwedding.listNameTeam
        holder.listCategoryTeam.text = listwedding.listCategoriesTeam
        holder.listImageTeam.setImageResource(listwedding.imageListTeam)
        holder.listPriceTeam.text = listwedding.listPriceTeam
        holder.listRatingTeam.text = listwedding.listRatingTeam
    }

    override fun getItemCount(): Int {
        return listWeddingList.size
    }
}