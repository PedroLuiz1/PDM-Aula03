package com.example.aula03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val editValor : EditText = findViewById(R.id.editValor)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            val valor = editValor.text.toString().toInt()

            if(valor == 0) {
                showDialog("O número é igual a 0")
            }

            if(valor % 2 == 0) {
                showDialog("O número é par")
            }

            if (valor % 2 != 0) {
                showDialog("O número é impar")
            }
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