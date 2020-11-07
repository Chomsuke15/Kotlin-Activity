package com.example.etonatalaga

import android.content.Intent
import android.hardware.Camera
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.provider.Settings
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class Next : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)


        var a = findViewById<Button>(R.id.btnCam)
        var b = findViewById<Button>(R.id.btnChrome)
        var c = findViewById<Button>(R.id.btnSettings)
        var d = findViewById<Button>(R.id.btnFail1)
        var e = findViewById<Button>(R.id.btnFail2)

        a.setOnClickListener()
        {
            val aa = Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(aa)
        }


        b.setOnClickListener {
            val chrome: Intent = Uri.parse("https://www.android.com").let { webpage ->
                Intent(Intent.ACTION_VIEW, webpage)
            }
            startActivity(chrome)


        }
        c.setOnClickListener{
            startActivity(Intent(Settings.ACTION_SETTINGS))
        }

        d.setOnClickListener()
        {
            Toast.makeText(this, "You have no GF", Toast.LENGTH_SHORT).show()
        }
        e.setOnClickListener()
        {
            Toast.makeText(this, "You can't, its too late", Toast.LENGTH_SHORT).show()
        }

    }



}
