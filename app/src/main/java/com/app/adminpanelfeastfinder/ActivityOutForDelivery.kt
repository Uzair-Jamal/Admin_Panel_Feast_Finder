    package com.app.adminpanelfeastfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.app.adminpanelfeastfinder.Adpater.DeliveryAdapter
import com.app.adminpanelfeastfinder.databinding.ActivityOutForDeliveryBinding

class ActivityOutForDelivery : AppCompatActivity() {
    private lateinit var binding: ActivityOutForDeliveryBinding
    private lateinit var deliveryAdapter: DeliveryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOutForDeliveryBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.imageBackBtn.setOnClickListener {
            finish()
        }
        val customerName = arrayListOf("Ali","Umair","Zafar","Farooq")
        val customerStatus = arrayListOf("Not Received","Received","Received","Pending")

        deliveryAdapter = DeliveryAdapter(customerName,customerStatus)
        binding.orderDeliveryStatusRv.layoutManager = LinearLayoutManager(this,VERTICAL,false)
        binding.orderDeliveryStatusRv.adapter = deliveryAdapter

    }
}