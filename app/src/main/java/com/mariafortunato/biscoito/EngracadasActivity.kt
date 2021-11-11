package com.mariafortunato.biscoito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.biscoito.databinding.ActivityEngracadasBinding

class EngracadasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEngracadasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_engracadas)

        binding = ActivityEngracadasBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnMostrarFrase.setOnClickListener {

            binding.imgFechado.setImageResource(R.drawable.biscoito_aberto)

            val mostrarFrase = binding.txtMostrar.text
            val frase = arrayListOf("Tem gente que se acha tanto que tá merecendo virar localização no Google Maps.",
                "Lamento, só estou aceitando pedidos de desculpa em dinheiro.",
                "Não siga as minhas pegadas, eu também estou perdido.", "Um sonho: ganhar dinheiro dormindo.",
                "A insônia te torna bom de matemática porque você passa a noite inteira tentando calcular quando tempo vai poder dormir. ",
                "Os trabalhos em grupo me ajudaram a entender por quê o Batman trabalha sozinho.",
                "Fofoqueira? Eu sou historiadora da vida alheia! ",
                "Na minha situação atual, se eu for cortar uma cebola, é ela que chora.",
                "Algumas pessoas são como nuvens: é só irem embora e o dia fica lindo.",
                "Não sou preguiçoso, estou no modo de economia de energia.",
                "Sempre sonhei em ser milionário como meu tio! Ele também está sonhando.",
                "Sabe como perdi 500 calorias em 1 segundo? Minha coxinha caiu no chão.",
                "Inveja de você? Inveja eu sinto do meu cachorro, que come, passeia e dorme o dia inteiro.",
                "Você passa o dia com sono, aí quando deita na cama fica com vontade de fazer um bolo, escrever um livro e aprender cinco idiomas novos.",
                "Só não jogo tudo pro alto, porque depois quem vai ter que juntar vai ser eu mesmo.")

            val numAleatorio = (0..14).random()


            binding.txtMostrar.text = "${frase[numAleatorio]}"

        }
        binding.btnVoltar.setOnClickListener {
            val mIntent = Intent(this, OpcoesActivity::class.java)
            startActivity(mIntent)
        }


    }
}