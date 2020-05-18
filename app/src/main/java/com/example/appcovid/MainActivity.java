package com.example.appcovid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// app de referencia para criacao das demais

        Button botaoCasa = findViewById(R.id.botao_entrada);

        botaoCasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acessoTelaCasa = new Intent(MainActivity.this, EntradaActivity.class);
                startActivity(acessoTelaCasa);
            }

        });


        Button botaoRisco = findViewById(R.id.botao_risco);

        botaoRisco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acessoTelaRisco = new Intent(MainActivity.this, RiscoActivity.class);
                startActivity(acessoTelaRisco);
            }

        });


        Button botaoSair = findViewById(R.id.botao_saida);

        botaoSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent acessoTelaSair = new Intent(MainActivity.this, SaidaActivity.class);
                startActivity(acessoTelaSair);
            }

        });


    }
    private static class ViewHolder{
        Button botaosair;
        TextView txt_titulo;

    }
}