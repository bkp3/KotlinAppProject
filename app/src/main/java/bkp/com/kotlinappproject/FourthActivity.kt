package bkp.com.kotlinappproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class FourthActivity : AppCompatActivity() {

    private lateinit var button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        button = findViewById(R.id.af_button)

        button.setOnClickListener(){

            val builder = AlertDialog.Builder(this)
            // set title for alert dialog
            builder.setTitle("Delete File")

            //set message for alert dialog
            builder.setMessage("Deleting file may harm for your system")

            builder.setIcon(android.R.drawable.ic_dialog_alert)

            // performing positive action
            builder.setPositiveButton("Yes"){dialogInterface, which->
                Toast.makeText(this,"You have clicked yes",Toast.LENGTH_SHORT).show()
            }

            // performing negative button
            builder.setNegativeButton("No"){dialogInterface, which->
                Toast.makeText(this,"You have clicked no",Toast.LENGTH_SHORT).show()
            }

            // performing cancel button
            builder.setNeutralButton("Cancel"){dialogInterface, which->
                Toast.makeText(this,"You have clicked cancel",Toast.LENGTH_SHORT).show()
            }

            // create the alert dialog
            val alertDialog: AlertDialog=builder.create()

            // set other dialog properties
            alertDialog.setCancelable(false)
            alertDialog.show()

        }

    }
}