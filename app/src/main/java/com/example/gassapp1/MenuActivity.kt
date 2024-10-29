package com.example.gassapp1

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        // Configura el botón para navegar a la configuración de sensores
        val menuSensorsButton: Button = findViewById(R.id.menu_sensors)
        menuSensorsButton.setOnClickListener {
            val intent = Intent(this, SensorConfigActivity::class.java)
            startActivity(intent)
        }

        // Configura el botón para navegar a la pantalla de alertas
        val menuAlertsButton: Button = findViewById(R.id.menu_alerts)
        menuAlertsButton.setOnClickListener {
            val intent = Intent(this, AlertsActivity::class.java)
            startActivity(intent)
        }

        // Configura el botón para navegar a la configuración general
        val menuSettingsButton: Button = findViewById(R.id.menu_settings)
        menuSettingsButton.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        // Configura el botón para navegar a la ayuda
        val menuHelpButton: Button = findViewById(R.id.menu_help)
        menuHelpButton.setOnClickListener {
            val intent = Intent(this, HelpActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return try {
            when (item.itemId) {
                R.id.menu_sensors -> {
                    startActivity(Intent(this, SensorConfigActivity::class.java))
                    true
                }
                R.id.menu_alerts -> {
                    startActivity(Intent(this, AlertsActivity::class.java)) // Navegar a AlertsActivity
                    true
                }
                R.id.menu_settings -> {
                    startActivity(Intent(this, SettingsActivity::class.java)) // Navegar a SettingsActivity
                    true
                }
                R.id.menu_help -> {
                    startActivity(Intent(this, HelpActivity::class.java)) // Navegar a HelpActivity
                    true
                }
                else -> super.onOptionsItemSelected(item)
            }
        } catch (e: Exception) {
            Toast.makeText(this, "Navigation Error: ${e.message}", Toast.LENGTH_SHORT).show()
            false
        }
    }
}

