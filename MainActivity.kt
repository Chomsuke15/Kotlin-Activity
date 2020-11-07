package com.example.etonatalaga

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var user = findViewById<EditText>(R.id.etUser)
        var pass = findViewById<EditText>(R.id.etPass)
        var log = findViewById<Button>(R.id.btnLogin)
        var alert = findViewById<TextView>(R.id.vtAlert)

        log.setOnClickListener{
            val name = user.getText().toString()
            val password = pass.getText().toString()
            if (name.equals("Den") && password.equals("pogi"))
            {
                Toast.makeText(this, "Logging in...", Toast.LENGTH_LONG)
                openNext()
            }
            else
            {
                Toast.makeText(this, "Invalid Credentials", Toast.LENGTH_SHORT).show()
            }

        }

    }
    fun openNext()
    {
        val intent = Intent(this, Next::class.java)
        startActivity(intent)
    }

}
