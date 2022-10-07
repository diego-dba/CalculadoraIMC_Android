package com.example.calculadora_de_imc


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Double
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //variável para facilitar mensagem de resposta
        val imc = resources.getString(R.string.resultado_imc)

        //variaveies para chamar os itens
        var textResultado = findViewById<TextView>(R.id.textResultado)
        val calcPeso = findViewById<EditText>(R.id.editPeso)
        val calcAltura = findViewById<EditText>(R.id.editAltura)
        val btCalcular = findViewById<Button>(R.id.buttonCalcular)

        //funcao p executar ao clicar
        btCalcular.setOnClickListener{
            //variaveis p receber e calcular os dados
            val answer1 = Double.parseDouble(calcPeso.getText().toString())
            val answer2 = Double.parseDouble(calcAltura.getText().toString())
            val res = answer1 / (answer2 * answer2)


           //metodo para fazer as verificacoes de acordo com
            // a tabela imc
            if (res < 19)
            {
                textResultado.text = imc + " " + (res).roundToInt() +". Você está abaixo do peso ideal."

            }
            else if (res <= 19 || res < 25){

                textResultado.text = imc + " " + (res).roundToInt() +". Você está no peso ideal."

            }
            else if (res <= 25  || res < 30){

                textResultado.text = imc + " " + (res).roundToInt() +". Você está com sobrepeso."

            }
            else if (res <= 30  || res < 40){

                textResultado.text = imc + " " + (res).roundToInt() +". Você está em obesidade grau 1."

            }
            else if (res >= 40){

                textResultado.text = imc + " " + (res).roundToInt() +". Você está em obesidade grau 2."

            }


        }




    }


}


