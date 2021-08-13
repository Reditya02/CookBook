package com.example.cookbook

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class AdapterFavorite(val favFood: ArrayList<Int>) :
    RecyclerView.Adapter<AdapterFavorite.Holder>() {
    private var listFood: ArrayList<Food> = FoodData.listData

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_favorite, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val food = listFood[favFood[position]]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(120, 120))
            .into(holder.itemPhoto)

        holder.itemName.text = food.name
        holder.itemBrief.text = food.brief

        holder.delete.setOnClickListener {
            FoodFavorite.remove(favFood[position])
            Toast.makeText(
                holder.itemView.context,
                "Item telah dihapus",
                Toast.LENGTH_SHORT
            ).show()
            notifyDataSetChanged()
        }

        holder.itemView.setOnClickListener {
            val context = holder.itemName.context
            val intent = Intent(context, ShowFood::class.java)
            intent.putExtra(ShowFood.POSITION, position)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return favFood.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemPhoto: ImageView = itemView.findViewById(R.id.item_photo)
        var itemName: TextView = itemView.findViewById(R.id.item_name)
        var itemBrief: TextView = itemView.findViewById(R.id.item_brief)
        var delete: Button = itemView.findViewById(R.id.btn_delete)
    }
}