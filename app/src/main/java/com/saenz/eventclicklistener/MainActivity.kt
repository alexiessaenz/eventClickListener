package com.saenz.eventclicklistener

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val TAG:String = MainActivity::class.qualifiedName.toString()
    lateinit var bt: Button
    lateinit var text: EditText
    lateinit var textDispl: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding()
        addEventListenr()
    }

    fun binding(){
        bt=findViewById(R.id.button)
        text=findViewById(R.id.editText)
        textDispl=findViewById(R.id.editText2)


    }

    fun addEventListenr(){
        bt.setOnClickListener(){
            var email:String = text.text.toString()
            var emailDispl:String = textDispl.text.toString()

            var inten = Intent(this,SecondActivity::class.java)
            inten.putExtra("mess",email)
            inten.putExtra("mess2",emailDispl)
            startActivity(inten)
            Log.d(TAG,"$email --- $emailDispl")
        }

    }
}
