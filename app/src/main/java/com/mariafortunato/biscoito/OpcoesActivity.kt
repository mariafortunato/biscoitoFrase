package com.mariafortunato.biscoito

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mariafortunato.biscoito.databinding.ActivityOpcoesBinding

class OpcoesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOpcoesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opcoes)

        binding = ActivityOpcoesBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnMotivacionais.setOnClickListener {
            val motivacionais = Intent(this, MotivacionaisActivity::class.java)
            startActivity(motivacionais)
        }
        binding.btnEngracadas.setOnClickListener {
            val engracadas = Intent(this, EngracadasActivity::class.java)
            startActivity(engracadas)
        }
        binding.btnMusicas.setOnClickListener {
            val musicas = Intent(this, MusicasActivity::class.java)
            startActivity(musicas)
        }
    }
}