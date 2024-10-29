package com.example.gassapp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SettingsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        val buttonBackSettings: Button = findViewById(R.id.button_back_settings)
        buttonBackSettings.setOnClickListener {
            mostrarMensajeRegreso()
        }
    }

    private fun mostrarMensajeRegreso() {
        // Mostrar un mensaje de confirmación antes de regresar
        Toast.makeText(this, "Regresando a la configuración anterior", Toast.LENGTH_SHORT).show()
        finish() // Regresar a la actividad anterior
    }
}

