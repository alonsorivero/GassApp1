package com.example.gassapp1

import android.os.Bundle
import android.view.View
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button

class HelpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        val buttonBackHelp: Button = findViewById(R.id.button_back_help)
        buttonBackHelp.setOnClickListener {
            finish() // Regresar a la actividad anterior
        }
    }
}
