package com.app.adminpanelfeastfinder.Adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.adminpanelfeastfinder.databinding.AllItemLayoutBinding

class AllItemAdapter(private val itemName: ArrayList<String>, private val itemPrice: ArrayList<String>,private val itemImage: ArrayList<Int> ): RecyclerView.Adapter<AllItemAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return  ItemViewHolder(AllItemLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return itemName.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ItemViewHolder(private val binding: AllItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.apply {
                allItemTv.text = itemName[position]
                allItemPrice.text = itemPrice[position]
                allItemIv.setImageResource(itemImage[position])
            }
        }

    }
}