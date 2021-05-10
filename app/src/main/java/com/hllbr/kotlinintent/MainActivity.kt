package com.hllbr.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun next(view : View){
        val intent = Intent(applicationContext,NextActivity::class.java)
        intent.putExtra("username",editText.text.toString())
        intent.putExtra("name",editText2.text.toString())
        startActivity(intent)
    }
}