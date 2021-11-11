package com.mariafortunato.biscoito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.biscoito.databinding.ActivityMotivacionaisBinding

class MotivacionaisActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMotivacionaisBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_motivacionais)

        binding = ActivityMotivacionaisBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGerarFrase.setOnClickListener {
            binding.imgFechado.setImageResource(R.drawable.biscoito_aberto)
            val mostrarFrase = binding.txtMostrarFrase.text
            val frase = arrayListOf("O sucesso é a soma de pequenos esforços repetidos dia após dia – Robert Collier, escritor.",
                "Nunca é tarde para ser o que você poderia ter sido – George Eliot, escritora",
                "Não desperdice sua energia tentando mudar opiniões. Faça seu trabalho e não ligue tanto para os outros – Tina Fey, atriz e apresentadora",
                "Ser você mesmo em um mundo que está sempre tentando te mudar é a maior conquista possível – Ralph Waldo Emerson, escritor",
                "Quando tudo parecer estar contra você, lembre-se de que o avião decola contra o vento, não com a ajuda dele – Henry Ford, empreendedor",
                "Tentar e falhar é, pelo menos, aprender. Não chegar a tentar é sofrer a inestimável perda do que poderia ter sido - Geraldo Eustáquio",
                "Sucesso não é o final; falhar não é fatal: é a coragem de continuar que conta - Winston Churchill",
                "É melhor você tentar algo, fracassar e aprender com isso do que não fazer nada - Mark Zuckerberg",
                "Lute. Acredite. Conquiste. Perca. Deseje. Espere. Alcance. Invada. Caia. Seja tudo o quiser ser, mas, acima de tudo, seja você sempre.",
                "A coragem não é ausência do medo; é a persistência apesar do medo.",
                "Não deixe que as pessoas te façam desistir daquilo que você mais quer na vida. Acredite. Lute. Conquiste. E acima de tudo, seja feliz!",
                "Não importa o que você decidiu. O que importa é que isso te faz feliz.",
                "Se não puder fazer tudo, faça tudo que puder.", "Por mais difícil que algo possa parecer, jamais desista antes de tentar!",
                "Valorize as pequenas conquistas.", "Não é fácil, mas com a dose certa de motivação, a gente conquista!")
            val numAleatorio = (0..14).random()

            binding.imgFechado.setBackgroundResource(R.drawable.biscoito_aberto)
            binding.txtMostrarFrase.text = "${frase[numAleatorio]}"

        }
        binding.btnVoltar.setOnClickListener {
            val mIntent = Intent(this, OpcoesActivity::class.java)
            startActivity(mIntent)
        }

    }
}