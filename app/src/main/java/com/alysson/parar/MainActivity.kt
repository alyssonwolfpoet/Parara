package com.alysson.parar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Toast
import com.alysson.parar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.vie.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        if (v.id == R.id.vie) {
            muda()
        }
    }

    private fun muda() {
        val tex = binding.vie

        when (tex.text) {
            getString(R.string.clique_aqui) -> {
                tex.text = getString(R.string.Pa)
            }

            getString(R.string.Pa) -> {
                tex.text = getString(R.string.ra)
            }

            getString(R.string.ra) -> {
                tex.text = getString(R.string.rá)
            }

            getString(R.string.rá) -> {
                tex.text = getString(R.string.parara)
            }

            getString(R.string.parara) -> {
                Toast.makeText(this, getString(R.string.final_text), Toast.LENGTH_SHORT).show()
                cont()
            }

            else -> {
                Toast.makeText(this, getString(R.string.erro_no_app), Toast.LENGTH_SHORT).show()
            }
        }

    }

    private fun cont() {
        contagem++
        if (contagem == 5) {
            binding.textView.text = getString(R.string.dev_alysson)
            binding.imageView.visibility = View.VISIBLE
        }
    }

    companion object Contagem {
        var contagem = 0
    }

}