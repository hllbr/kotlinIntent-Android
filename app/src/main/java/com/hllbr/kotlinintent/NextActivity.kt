package com.hllbr.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)


    //getIntent

    val intent = intent
    val userName = intent.getStringExtra("username")
    val name = intent.getStringExtra("name")
    userText.text = "UserName : ${userName}"
    nameText.text = "Name : ${name}"
    }
    fun back(view : View){
        val intent = Intent(applicationContext,MainActivity::class.java)
        startActivity(intent)
    }
}