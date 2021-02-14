package bkp.com.kotlinappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class FirstActivity : AppCompatActivity() {

    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        button = findViewById(R.id.a1_button)
        button.setOnClickListener(){
            Toast.makeText(this,"button is clicked",Toast.LENGTH_SHORT).show()
        }

    }
}