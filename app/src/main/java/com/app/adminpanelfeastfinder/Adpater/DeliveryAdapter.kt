package com.app.adminpanelfeastfinder.Adpater

import android.content.res.ColorStateList
import android.graphics.Color
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.adminpanelfeastfinder.databinding.DeliveryItemBinding

class DeliveryAdapter(private val customerName: ArrayList<String>, private val customerMoney: ArrayList<String>): RecyclerView.Adapter<DeliveryAdapter.DeliveryViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DeliveryViewHolder {
        return DeliveryViewHolder(DeliveryItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return customerName.size
    }

    override fun onBindViewHolder(holder: DeliveryViewHolder, position: Int) {
        holder.bind(position)
    }
    inner class DeliveryViewHolder(private val binding: DeliveryItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.customerName.text = customerName[position]
            binding.orderDeliver.text = customerMoney[position]
            val colorMap = mapOf(
                "Received" to Color.GREEN, "Not Received" to Color.RED, "Pending" to Color.GRAY
            )
            binding.orderDeliver.setTextColor(colorMap[customerMoney[position]]?:Color.BLACK)
            binding.status.backgroundTintList = ColorStateList.valueOf(colorMap[customerMoney[position]]?:Color.BLACK)


        }

    }
}