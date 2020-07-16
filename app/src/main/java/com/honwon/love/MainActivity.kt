package com.honwon.love

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_setting.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.actionbar_actions, menu) ;
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_settings -> {
            // User chose the "Settings" item, show the app settings UI...
            var MSG = intent.getStringExtra("msgg")
            val intent = Intent(this, SettingActivity::class.java)
            intent.putExtra("msg", if(MSG ==null){"너를 좋아해"} else{MSG})
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            startActivity(intent)


            true
        }
        else -> {
            // If we got here, the user's action was not recognized.
            // Invoke the superclass to handle it.
            super.onOptionsItemSelected(item)
        }
    }





    val preference by lazy {getSharedPreferences("PrefExActivity", Context.MODE_PRIVATE)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
// 앱바 이름 아이콘
        val ab = supportActionBar









//앱바 이름 등록
        ab!!.title = ""

        button.setOnClickListener {
            var MSG = intent.getStringExtra("msgg")


            //MSG?.let {saveData(MSG)}


            var a :String =
                if(MSG == null){
                    "너를 좋아해"  + "                              "
                } else {
                    MSG + "                               "
                }
            var example = arrayOf(" ","${a[0]}","${a[1]}","${a[2]}","${a[3]}","${a[4]}","${a[5]}","${a[6]}","${a[7]}","${a[8]}",
                "${a[9]}","${a[10]}","${a[11]}","${a[12]}","${a[13]}","${a[14]}","${a[15]}","${a[16]}","${a[17]}","${a[18]}","${a[19]}","${a[20]}")
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

    open fun saveData(data: String?) {

        val pref = getSharedPreferences("pref", Context.MODE_PRIVATE);
        val editor = pref.edit()
        editor.putString("KEY_DATA", data)
        editor.apply()
    }

    open fun loadData() {
        val pref = getSharedPreferences("pref", Context.MODE_PRIVATE)
        val A = pref.getString("KEY_DATA","너를 좋아해")

    }

}
