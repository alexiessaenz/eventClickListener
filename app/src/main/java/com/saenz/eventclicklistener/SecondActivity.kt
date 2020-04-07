package com.saenz.eventclicklistener

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    val TAG:String=SecondActivity::class.qualifiedName.toString()

    lateinit var email:TextView
    lateinit var message:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
            bindView()
        if (intent!=null){
            var emails=intent.getStringExtra(MainActivity.EMAIL_KEY)
            var emails2=intent.getStringExtra(MainActivity.MESSAGE_KEY)

            email.text = emails
            message.text = emails2
        }
    }

    fun bindView(){
        email = findViewById(R.id.tv_emailSecondview)
        message = findViewById(R.id.tv_messageSecondView)
    }

}
