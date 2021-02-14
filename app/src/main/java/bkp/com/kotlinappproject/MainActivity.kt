package bkp.com.kotlinappproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import bkp.com.kotlinappproject.First.FirstActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val button3 = findViewById<Button>(R.id.button3)
        val button4 = findViewById<Button>(R.id.button4)
        val button5 = findViewById<Button>(R.id.button5)
        val button6 = findViewById<Button>(R.id.button6)

        button1.setOnClickListener(){
            var intent = Intent(this, FirstActivity::class.java)
            startActivity(intent)
        }

        button2.setOnClickListener(){
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
        }

        button3.setOnClickListener(){
            val intent = Intent(this,ThirdActivity::class.java)
            startActivity(intent)
        }

        button4.setOnClickListener(){
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }



    }
}