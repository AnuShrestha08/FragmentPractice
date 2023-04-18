package com.swift.fragmentbundle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val firstFragment1 = Fragment1()
        val secondFragment2 = Fragment2()
        val btn_fragment = findViewById<Button>(R.id.fragment1_btn)
        val btn_fragment2 = findViewById<Button>(R.id.fragment2_btn)
         supportFragmentManager.beginTransaction().apply {
             replace(R.id.frame_container, firstFragment1)
             commit()
         }
        btn_fragment.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, firstFragment1)
                addToBackStack(null)
                commit()
            }
        }
        btn_fragment2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.frame_container, secondFragment2)
                addToBackStack(null)
                commit()
            }
        }
    }
}