package bkp.com.kotlinappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class SixthActivity : AppCompatActivity() {

    val language = arrayOf<String>("C","C++","Java","Python","Kotlin","JavaScript","C#","Swit","PHP","Go","Objective-C")
    private lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        listView = findViewById(R.id.a6_listView)

        val arrayAdapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,language)
        listView.adapter=arrayAdapter


    }
}