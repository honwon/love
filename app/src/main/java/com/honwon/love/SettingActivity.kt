package com.honwon.love

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Browser
import kotlinx.android.synthetic.main.activity_setting.*
import org.jetbrains.anko.browse

class SettingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        button2.setOnClickListener {
            browse("https://play.google.com/store/apps/developer?id=Honwon98")
        }



        var msg = intent.getStringExtra("msg")
        editText.setText(msg)

        saveBtn.setOnClickListener {



            val intent = Intent(this, MainActivity::class.java)
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            intent.putExtra("msgg",editText.text.toString())
            startActivity(intent)


        }

    }

}