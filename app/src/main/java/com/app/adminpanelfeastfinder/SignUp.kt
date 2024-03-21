package com.app.adminpanelfeastfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.app.adminpanelfeastfinder.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.createAcc.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
        binding.haveAcc.setOnClickListener {
            startActivity(Intent(this,Login::class.java))
        }
        val locationList = arrayOf("Karachi","Lahore","Islamabad","Quetta","Multan","Hyderabad","Peshawar")
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1,locationList)
        val autoCompleteText = binding.listOfLoc
        autoCompleteText.setAdapter(adapter)
    }
}