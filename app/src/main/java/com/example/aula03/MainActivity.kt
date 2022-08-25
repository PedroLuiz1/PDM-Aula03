package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editValor1 : EditText = findViewById(R.id.editValor1)
        val editValor2 : EditText = findViewById(R.id.editValor2)
        val buttonSomar : Button = findViewById(R.id.buttonSomar)
        val buttonSub : Button = findViewById(R.id.buttonSub)
        val buttonMulti : Button = findViewById(R.id.buttonMulti)
        val buttonDividir : Button = findViewById(R.id.buttonDividir)

        buttonSomar.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 + valor2

            showDialog("A soma é " + resultado)
        }

        buttonSub.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 - valor2

            showDialog("O resultado é " + resultado)
        }

        buttonMulti.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 * valor2

            showDialog("O resultado é " + resultado)
        }

        buttonDividir.setOnClickListener {
            val valor1 = editValor1.text.toString().toInt()
            val valor2 = editValor2.text.toString().toInt()

            val resultado = valor1 / valor2

            showDialog("O resultado é " + resultado)
        }

    }

    fun showDialog(msg: String) {
        AlertDialog.Builder(this)
        .setMessage(msg)
        .setPositiveButton("OK", null)
        .create()
        .show()
    }

}