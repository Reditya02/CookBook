package com.example.cookbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ShowFood : AppCompatActivity() {
    companion object {
        const val POSITION = "POSITION"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show_menu)

        val position = intent.getIntExtra(POSITION, 0)

        val itemPhoto: ImageView = findViewById(R.id.item_photo)
        val itemName: TextView = findViewById(R.id.item_name)
        val itemBrief: TextView = findViewById(R.id.item_brief)
        val itemMaterial: TextView = findViewById(R.id.food_material)
        val itemStep: TextView = findViewById(R.id.food_step)

        val food: Food = FoodData.listData[position]

        Glide.with(itemPhoto)
            .load(food.photo)
            .apply(RequestOptions().override(150, 150))
            .into(itemPhoto)

        itemName.text = food.name
        itemBrief.text = food.brief
        itemMaterial.text = food.material
        itemStep.text = food.step

        supportActionBar?.title = food.name

    }
}