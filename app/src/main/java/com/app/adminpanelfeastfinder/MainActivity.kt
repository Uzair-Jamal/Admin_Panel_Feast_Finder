package com.app.adminpanelfeastfinder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.app.adminpanelfeastfinder.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.addMenu.setOnClickListener {
            startActivity(Intent(this, AddItem::class.java))
        }
        binding.allMenu.setOnClickListener {
            val intent = Intent(this, AllItem::class.java)
            startActivity(intent)
        }
        binding.allItem.setOnClickListener {
            startActivity(Intent(this,AllItem::class.java))
        }
    }
}