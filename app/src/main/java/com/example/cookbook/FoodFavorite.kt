package com.example.cookbook

import android.widget.Toast

class FoodFavorite {
    companion object {
        var listFavorite: ArrayList<Int> = ArrayList()

        fun search(i: Int): Boolean {
            for (index in listFavorite) {
                if (index == i)
                    return true
            }
            return false
        }

        fun add(i: Int) {
            listFavorite.add(i)
        }

        fun remove(i: Int) {
            listFavorite.remove(i)
        }

    }
}

/*object FoodFavorite {
    var listFavorite: ArrayList<Int> = ArrayList()

    fun search(i: Int): Boolean {
        for (index in listFavorite) {
            if (index == i)
                return true
        }
        return false
    }

    fun add(i: Int) {
        listFavorite.add(i)
    }

    fun remove(i: Int) {
        listFavorite.remove(i)
    }
}*/
