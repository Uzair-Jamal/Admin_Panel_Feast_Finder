package com.app.adminpanelfeastfinder.Adpater

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.adminpanelfeastfinder.databinding.AllItemLayoutBinding

class AllItemAdapter(private val itemName: ArrayList<String>, private val itemPrice: ArrayList<String>, private val itemImage: ArrayList<Int>) :
    RecyclerView.Adapter<AllItemAdapter.ItemViewHolder>() {

    private val itemQuantities = IntArray(itemName.size) { 1 }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = AllItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return itemName.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(position)
    }

    inner class ItemViewHolder(private val binding: AllItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(position: Int) {
            if (position < itemName.size) {
                binding.apply {
                    val quantity = itemQuantities[position]
                    allItemTv.text = itemName[position]
                    allItemPrice.text = itemPrice[position]
                    allItemQuantity.text = quantity.toString()
                    allItemIv.setImageResource(itemImage[position])

                    minusBtn.setOnClickListener {
                        if (itemQuantities[position] > 0) {
                            itemQuantities[position]--
                            binding.allItemQuantity.text = itemQuantities[position].toString()
                        }
                    }

                    plusBtn.setOnClickListener {
                        if (itemQuantities[position] < 10) {
                            itemQuantities[position]++
                            binding.allItemQuantity.text = itemQuantities[position].toString()
                        }
                    }

                    deleteItem.setOnClickListener {
                        removeItem(position)
                    }
                }
            }
        }
    }

    private fun removeItem(position: Int) {
        itemName.removeAt(position)
        itemPrice.removeAt(position)
        itemImage.removeAt(position)
        notifyItemRemoved(position)
        notifyItemRangeChanged(position, itemCount)
    }
}
