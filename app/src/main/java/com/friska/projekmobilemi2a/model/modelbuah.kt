package com.friska.projekmobilemi2a.model

import com.friska.projekmobilemi2a.R

data class modelbuah(
    val image : Int,
    val nama : String
)
//kita mock data untuk array

object MockList{
    fun getModel() : List<modelbuah>{
        val itemModel1 = modelbuah(
            R.drawable.apple,
            "Apple"
        )
        val itemModel2 = modelbuah(
            R.drawable.grapes,
            "Anggur"
        )
        val itemModel3 = modelbuah(
            R.drawable.orange,
            "Jeruk"
        )
        val itemModel4 = modelbuah(
            R.drawable.pear,
            "Pear"
        )
        val itemModel5 = modelbuah(
            R.drawable.strawberry,
            "Strowbery"
        )
        val itemModel6 = modelbuah(
            R.drawable.orange,
            "Orange"
        )

        val itemList: ArrayList<modelbuah> = ArrayList()
        itemList.add(itemModel1)
        itemList.add(itemModel2)
        itemList.add(itemModel3)
        itemList.add(itemModel4)
        itemList.add(itemModel5)
        itemList.add(itemModel6)

        return itemList

    }
}
