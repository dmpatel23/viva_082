package com.example.viva_082

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val RegisterButton = findViewById<Button>(R.id.registerbtn)
        val nameedit = findViewById<EditText>(R.id.nameedit)
        val ennoedit = findViewById<EditText>(R.id.ennoedit)
        val branchedit = findViewById<EditText>(R.id.branchedit)
        RegisterButton.setOnClickListener()
        {
            val message = "Name: " + nameedit.text + "\nEnrollment No: " + ennoedit.text + "\nBranch: "+ branchedit.text
            Toast.makeText(this,message,Toast.LENGTH_LONG).show()
        }
    }
}