package com.honwon.love

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_setting.*

class SettingActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        var msg = intent.getStringExtra("msg")
        editText.setText(msg)

        saveBtn.setOnClickListener {
            saveData(editText.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("msgg",editText.text.toString())
            startActivity(intent)
            finish()
        }

    }
    open fun saveData(data: String) {

        val pref = getSharedPreferences("pref", Context.MODE_PRIVATE);
        val editor = pref.edit()
        editor.putString("KEY_DATA", data)
        editor.apply()
    }

    open fun loadData() {
        val pref = getSharedPreferences("pref", Context.MODE_PRIVATE)
        val height = pref.getString("KET_DATA","")
    }
}