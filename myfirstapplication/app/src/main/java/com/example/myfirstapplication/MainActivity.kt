package com.example.lesson

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnShowView.setOnClickListener {}
        val dialog = DialogApprove()
        dialog.show(supportFragmentManager, "DialogApprove")
    }
}

}
