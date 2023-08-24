package br.edu.up.minhanovaaplicacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun proximaTela(elemento:View){
        val novaTela: Intent = Intent(this, Home::class.java)
        startActivity(novaTela)
    }

    fun botaoLogin(elemento: View){
        val editTextUsername: EditText = findViewById(R.id.)
        val editTextPassword: EditText = findViewById(R.id.)

    }

}