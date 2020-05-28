package com.honwon.love

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Vibrator
import android.system.Os.remove
import android.view.Gravity
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import java.util.Timer
import java.util.concurrent.TimeUnit
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)






        button.setOnClickListener {
            var example = arrayOf(" ","너","를"," ","좋","아","해"," ","사","랑","해"," ","♥"," "," "," "," "," "," "," "," "," "," "," "," ")
            fading_test_view.setTexts(example)
            fading_test_view.setTimeout(2000, TimeUnit.MILLISECONDS)




            /*var time :Int = 0
            Handler().postDelayed({
           Toast.makeText(this@MainActivity,"    너    ", Toast.LENGTH_LONG).show()
            }, 1000)

            Handler().postDelayed({
                Toast.makeText(this@MainActivity, "    를    ", Toast.LENGTH_LONG).show()
            }, 3700)


            Handler().postDelayed({
                Toast.makeText(this@MainActivity, "    ...    ", Toast.LENGTH_LONG).show()
            }, 6500)


            Handler().postDelayed({
            Toast.makeText(this@MainActivity, "    좋    ", Toast.LENGTH_LONG).show()
            }, 9500)


            Handler().postDelayed({
            Toast.makeText(this@MainActivity, "    아    ", Toast.LENGTH_LONG).show()
            }, 12500)


            Handler().postDelayed({
                Toast.makeText(this@MainActivity, "    해    ", Toast.LENGTH_LONG).show()
            }, 15500)



            Handler().postDelayed({
                Toast.makeText(this@MainActivity, "      ", Toast.LENGTH_LONG).show()
            }, 18000) */
        }


    }




}
