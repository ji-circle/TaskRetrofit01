package com.example.taskretrofit01

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.taskretrofit01.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


    }

}