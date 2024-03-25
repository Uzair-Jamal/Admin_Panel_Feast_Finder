package com.app.adminpanelfeastfinder

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.app.adminpanelfeastfinder.databinding.ActivityAddItemBinding

class AddItem : AppCompatActivity() {
    private lateinit var binding: ActivityAddItemBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityAddItemBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.selectImage.setOnClickListener {
            pickImage.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
        }

        binding.backAddItem.setOnClickListener {
            finish()
        }
    }

    val pickImage = registerForActivityResult(ActivityResultContracts.PickVisualMedia()){uri ->
        if(uri != null){
          binding.selectedImg.setImageURI(uri)
        }
    }
}