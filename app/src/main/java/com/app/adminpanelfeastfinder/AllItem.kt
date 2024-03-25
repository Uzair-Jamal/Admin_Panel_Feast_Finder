package com.app.adminpanelfeastfinder

import android.graphics.drawable.ClipDrawable.VERTICAL
import android.icu.lang.UCharacter.VerticalOrientation
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.adminpanelfeastfinder.Adpater.AllItemAdapter
import com.app.adminpanelfeastfinder.databinding.ActivityAllItemBinding

class AllItem : AppCompatActivity() {

    private lateinit var binding : ActivityAllItemBinding
    private lateinit var adapter: AllItemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodName = arrayListOf("Burger","Nihari","Burger","Nihari","Burger","Nihari")
        val foodPrices = arrayListOf("$34,$23,$56,$12,$22,$11")
        val foodImage = arrayListOf(
            R.drawable.menu1,
            R.drawable.menu2,
            R.drawable.menu3,
            R.drawable.menu4,
            R.drawable.menu1,
            R.drawable.menu1
        )
        adapter = AllItemAdapter(foodName,foodPrices,foodImage)
        binding.allItemRv.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL,false)
        binding.allItemRv.adapter = adapter

        binding.backAddItem.setOnClickListener {
            finish()
        }
    }
}