package com.example.imagenact2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import kotlin.math.log
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var txtnumero: TextView
    lateinit var imgdado: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtnumero = findViewById(R.id.txtnumero)
        imgdado = findViewById(R.id.imgdado)
    }

    fun lanzaDado(v: View) {
        Log.d("DadoApp", "lanzaDado: ")//print
        val numeroAleatorio = Random.nextInt(6) + 1;
        val imagenAponer = when(numeroAleatorio) {
            1 -> {
                txtnumero.setText("1")
                R.drawable.dice_1;
            }
            2 -> {
                txtnumero.setText("2")
                R.drawable.dice_2;
            }
            3 -> {
                txtnumero.setText("3")
                R.drawable.dice_3;
            }
            4 -> {
                txtnumero.setText("4")
                R.drawable.dice_4;
            }
            5 -> {
                txtnumero.setText("5")
                R.drawable.dice_5;
            }
            else -> {
                txtnumero.setText("6")
                R.drawable.dice_6;}
        }
            imgdado.setImageResource(imagenAponer)
        }
    }
