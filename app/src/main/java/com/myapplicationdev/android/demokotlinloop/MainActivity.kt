package com.myapplicationdev.android.demokotlinloop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        btnCount.setOnClickListener {
//            for (i in 1..5) {
//                Log.d("MainActivity", "$i")
//            }
            var i = 1
            while (i < 6) {
                Log.d("MainActivity", "$i")
                i++
            }
        }
        btnLetterByLetter.setOnClickListener {
            val word = etWord.text
            for (letter in word) {
                Log.d("MainActivity", letter.toString())
            }
        }
    }
}