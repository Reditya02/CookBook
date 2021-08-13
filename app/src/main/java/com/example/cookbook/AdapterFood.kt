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

class AdapterFood(val inFood: ArrayList<Food>) : RecyclerView.Adapter<AdapterFood.Holder>() {
    private var listFood = inFood
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(120, 120))
            .into(holder.itemPhoto)

        holder.itemName.text = food.name
        holder.itemBrief.text = food.brief

        holder.favorite.setOnClickListener {
            if (FoodFavorite.search(position)) {
                Toast.makeText(
                    holder.itemView.context,
                    "Item telah ada di favorite",
                    Toast.LENGTH_SHORT
                ).show()
            } else {
                Toast.makeText(
                    holder.itemView.context,
                    "Item telah ditambahkan ke favorite",
                    Toast.LENGTH_SHORT
                ).show()
                FoodFavorite.add(position)
            }
        }

        holder.itemView.setOnClickListener {
            val context = holder.itemName.context
            val intent = Intent(context, ShowFood::class.java)
            intent.putExtra(ShowFood.POSITION, position)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemPhoto: ImageView = itemView.findViewById(R.id.item_photo)
        var itemName: TextView = itemView.findViewById(R.id.item_name)
        var itemBrief: TextView = itemView.findViewById(R.id.item_brief)
        var favorite: Button = itemView.findViewById(R.id.btn_favorite)
    }
}