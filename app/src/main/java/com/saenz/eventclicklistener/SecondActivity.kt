package com.saenz.eventclicklistener

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    val TAG:String=SecondActivity::class.qualifiedName.toString()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        if (intent!=null){
            var emails=intent.getStringExtra("mess")
            var emails2=intent.getStringExtra("mess2")
        }
    }
}
