package com.mata.a01_status_w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    val TAG = "Estados"
    private lateinit var txtID: EditText
    private lateinit var txtPasswd: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtID =  findViewById(R.id.txtID)
        txtPasswd = findViewById(R.id.txtPasswd)


    }



}