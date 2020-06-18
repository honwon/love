package com.honwon.love

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_actions, menu) ;
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            // User chose the "Settings" item, show the app settings UI...
            startActivity(Intent(this,SettingActivity::class.java))
            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
// 앱바 이름 아이콘
        val ab = supportActionBar

//앱바 이름 등록
        ab!!.title = ""


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
