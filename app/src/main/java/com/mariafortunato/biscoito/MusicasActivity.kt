package com.mariafortunato.biscoito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.biscoito.databinding.ActivityMusicasBinding

class MusicasActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMusicasBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_musicas)

        binding = ActivityMusicasBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAparecerFrase.setOnClickListener {
            binding.imgBiscoitoFechado.setImageResource(R.drawable.biscoito_aberto)

            val frase = arrayListOf("Não espere o futuro mudar tua vida, porque o futuro é a consequência do presente - Racionais Mc's (A Vida é Desafio)",
                "Ser melhor do que fui ontem é o plano que a minha alma escreveu - Projota (Plantar o Bem)",
                "Siga em frente e não olhe para trás, o melhor da vida é você quem faz - Fundo de Quintal (Pra Alegria Eu Peço Bis)",
                "Vi que era amor quando te achei em mim e me perdi em você - Melim (Dois Corações)",
                "Pior que errar é não querer mudar - Haikaiss (Ponto de Vista)",
                "Você vai rir, sem perceber. Felicidade é só questão de ser - Marcelo Jeneci (Felicidade)",
                "Deixo a tristeza e trago a esperança em seu lugar. – Cássia Eller",
                "Respeito muito minhas lágrimas, mas ainda mais minha risada. – Gal Costa",
                "Sempre em frente, não temos tempo a perder. – Legião Urbana",
                "Pra você guardei o amor que aprendi vendo os meus pais o amor que tive e recebi e hoje posso dar livre e feliz – Nando Reis",
                "Tolice é viver a vida assim sem aventura. – Lulu Santos",
                "Vamos sorrir e celebrar tudo que há de bom. – Natiruts",
                "Se alguém perguntar por mim, diz que fui por aí. – Nara Leão",
                "Disciplina é liberdade. Compaixão é fortaleza. Ter bondade é ter coragem. – Legião Urbana",
                "Eu só quero saber em qual rua minha vida vai encostar na tua. – Ana Carolina")
            val numAleatorio= (0..14).random()

            binding.txtAparecerFrase.text = "${frase[numAleatorio]}"

        }
        binding.btnVolta.setOnClickListener {
            val mIntent = Intent(this, OpcoesActivity::class.java)
            startActivity(mIntent)
        }
    }

}