package com.example.gassapp1

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class AlertsActivity : AppCompatActivity() {

    private lateinit var alertTitle: TextView
    private lateinit var alertMessage: TextView
    private lateinit var contactEmergencyButton: Button
    private lateinit var turnOffDevicesButton: Button
    private lateinit var ventilateMessage: TextView
    private lateinit var buttonBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alerts)

        // Inicializa las vistas
        alertTitle = findViewById(R.id.alertTitle)
        alertMessage = findViewById(R.id.alertMessage)
        contactEmergencyButton = findViewById(R.id.contactEmergencyButton)
        turnOffDevicesButton = findViewById(R.id.turnOffDevicesButton)
        ventilateMessage = findViewById(R.id.ventilateMessage)
        buttonBack = findViewById(R.id.button_back)

        // Configura los listeners de los botones
        contactEmergencyButton.setOnClickListener { llamarEmergencias() }
        turnOffDevicesButton.setOnClickListener { apagarDispositivos() }
        buttonBack.setOnClickListener { finish() } // Regresar a la actividad anterior
    }

    private fun llamarEmergencias() {
        // Lógica para contactar emergencias
        Toast.makeText(this, "Llamando a emergencias...", Toast.LENGTH_SHORT).show()
        // Aquí puedes añadir más lógica si es necesario
    }

    private fun apagarDispositivos() {
        // Lógica para apagar dispositivos conectados
        Toast.makeText(this, "Todos los dispositivos han sido apagados.", Toast.LENGTH_SHORT).show()
        // Aquí puedes añadir más lógica si es necesario
    }
}


