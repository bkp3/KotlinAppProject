package bkp.com.kotlinappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView1 = findViewById<TextView>(R.id.as_textView1)
        val textView2 = findViewById<TextView>(R.id.as_textView2)
        val textView3 = findViewById<TextView>(R.id.as_textView3)
        val textView4 = findViewById<TextView>(R.id.as_textView4)
        val editText = findViewById<EditText>(R.id.as_editText)
        val button = findViewById<Button>(R.id.as_button)


        button.setOnClickListener(){
            val str: String = editText.text.toString()
            if(str==null || str.trim()==""){
                Toast.makeText(this,"please input data",Toast.LENGTH_LONG).show()
            }else{
                textView3.setText(str).toString()
            }
        }

        textView4.setOnClickListener(){
            textView3.setText("-----").toString()
        }


    }
}