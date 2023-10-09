package com.mata.a01_status_w3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import android.widget.EditText
import android.content.Intent

class MainActivity : AppCompatActivity() {
    private lateinit var txtID: EditText
    private lateinit var txtPasswd: EditText
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtID   = findViewById(R.id.txtID)
        txtPasswd   = findViewById(R.id.txtPasswd)
    }
    fun ejecutar(view:View){
        var aplicar = true
        if (txtID.getText().toString().trim({ it <= ' ' }).length == 0) {
            Toast.makeText(this, "Id requerido", Toast.LENGTH_SHORT).show()
            txtID.requestFocus()
            aplicar = false
        }
        if (txtPasswd.getText().toString().trim({ it <= ' ' }).length == 0) {
            Toast.makeText(this, "Contraseña Requerida", Toast.LENGTH_SHORT).show()
            txtPasswd.requestFocus()
            aplicar = false
        }
        if (aplicar) {
            //Invoca otra ventana
            val laotra = Intent(this, NavigationLWP::class.java)

            laotra.putExtra("id", txtID.getText())
            laotra.putExtra("nombre", txtPasswd.getText())
            val intentActivity = laotra.resolveActivity(packageManager)
            if (intentActivity != null) {
                startActivity(laotra)
            } else {
                Toast.makeText(this, "No hay ninguna actividad que pueda manejar el intent", Toast.LENGTH_SHORT).show()
            }
        }

    }
    }