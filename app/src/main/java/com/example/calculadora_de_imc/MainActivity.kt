package com.example.calculadora_de_imc


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Double

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var textResultado = findViewById<TextView>(R.id.textResultado)
        val calcPeso = findViewById<EditText>(R.id.editPeso)
        val calcAltura = findViewById<EditText>(R.id.editAltura)
        val btCalcular = findViewById<Button>(R.id.buttonCalcular)


        btCalcular.setOnClickListener{

            val answer1 = Double.parseDouble(calcPeso.getText().toString())
            val answer2 = Double.parseDouble(calcAltura.getText().toString())
            val res = answer1 / (answer2 * answer2)

            textResultado.text = ""

            if (res < 19)
            {
                textResultado.text = "O resultado é " + (res) +". Você está abaixo do peso ideal."

            }
            else if (res <= 19 || res < 25){

                textResultado.text = "O resultado é " + (res) +". Você está no peso ideal."

            }
            else if (res <= 25  || res < 30){

                textResultado.text = "O resultado é " + (res) +". Você está com sobrepeso."

            }
            else if (res <= 30  || res < 40){

                textResultado.text = "O resultado é " + (res) +". Você está em obesidade grau 1."

            }
            else if (res >= 40){

                textResultado.text = "O resultado é " + (res) +". Você está em obesidade grau 2."

            }


        }




    }


}


