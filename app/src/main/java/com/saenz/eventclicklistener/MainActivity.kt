package com.saenz.eventclicklistener

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    val TAG:String = MainActivity::class.qualifiedName.toString()

    companion object{
        val EMAIL_KEY="text_email"
        val MESSAGE_KEY="text_message"
    }

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
            inten.putExtra(EMAIL_KEY,email)
            inten.putExtra(MESSAGE_KEY,emailDispl)
            startActivity(inten)
            Log.d(TAG,"$email --- $emailDispl")
        }

    }
}
