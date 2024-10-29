package com.example.gassapp1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SensorConfigActivity : AppCompatActivity() {

    private lateinit var sensorNombre: TextView
    private lateinit var sensorEstado: TextView
    private lateinit var btnAgregarSensor: Button
    private lateinit var btnEliminarSensor: Button
    private lateinit var btnGuardarConfiguracion: Button
    private lateinit var btnRegresar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor_config)

        // Inicializa los componentes de la interfaz
        sensorNombre = findViewById(R.id.sensor_nombre)
        sensorEstado = findViewById(R.id.sensor_estado)
        btnAgregarSensor = findViewById(R.id.btn_agregar_sensor)
        btnEliminarSensor = findViewById(R.id.btn_eliminar_sensor)
        btnGuardarConfiguracion = findViewById(R.id.btn_guardar_configuracion)
        btnRegresar = findViewById(R.id.button_back_settings)

        // Configura los listeners para los botones
        btnAgregarSensor.setOnClickListener { agregarSensor() }
        btnEliminarSensor.setOnClickListener { eliminarSensor() }
        btnGuardarConfiguracion.setOnClickListener { guardarConfiguracion() }
        btnRegresar.setOnClickListener { onBackPressed() }
    }

    private fun agregarSensor() {
        // Lógica para agregar un sensor (puedes personalizar esto)
        val nombre = sensorNombre.text.toString()
        if (nombre.isNotEmpty()) {
            // Aquí puedes añadir lógica para agregar el sensor a una lista o base de datos
            Toast.makeText(this, "Sensor '$nombre' agregado exitosamente.", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Por favor, ingresa un nombre para el sensor.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun eliminarSensor() {
        // Lógica para eliminar el sensor (puedes personalizar esto)
        val nombre = sensorNombre.text.toString()
        if (nombre.isNotEmpty()) {
            // Aquí puedes añadir lógica para eliminar el sensor de una lista o base de datos
            Toast.makeText(this, "Sensor '$nombre' eliminado exitosamente.", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "No hay sensor para eliminar.", Toast.LENGTH_SHORT).show()
        }
    }

    private fun guardarConfiguracion() {
        // Lógica para guardar la configuración (puedes personalizar esto)
        // Aquí puedes añadir lógica para guardar configuraciones en una base de datos o preferencias
        Toast.makeText(this, "Configuración guardada exitosamente.", Toast.LENGTH_SHORT).show()
    }
}


