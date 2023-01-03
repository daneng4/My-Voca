package com.kuj.myvocanote

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kuj.myvocanote.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var Binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)



    }
}