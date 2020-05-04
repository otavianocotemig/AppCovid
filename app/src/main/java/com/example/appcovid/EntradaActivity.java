package com.example.appcovid;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EntradaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entrada);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView txt_info = findViewById(R.id.txt_titulo);

        txt_info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Intent.ACTION_SEND);
                i.putExtra(i.EXTRA_SUBJECT, "Informações Covid 19");
                i.putExtra(i.EXTRA_TEXT, "Cuidados necessários ao chegar em casa: \n" +
                        "Não toque em nada, antes de se higienizar. \n" +
                        "Retire os sapatos.\n" +
                        "Desinfete as patas do seu pet após passear com ele.\n" +
                        "Tire a roupa e coloque-a em uma sacola plástica no cesto de roupas. Lave-as!\n" +
                        "Deixe bolsa, carteira, chaves, etc, em uma caixa na entrada.\n" +
                        "Tome banho! Se não puder, lave bem todas as áreas expostas.\n" +
                        "Limpe seu celular e os óculos com sabão e água ou álcool.\n" +
                        "Limpe as embalagens que trouxe de fora antes de guardar.\n" +
                        "Tire as luvas com cuidado, jogue-as fora e lave as mãos.\n" +
                        "Lembre-se que não é possível fazer uma desinfecção total, o objetivo é reduzir o risco.\n" +
                        "Fique em casa!");
                i.setType("text/plain");
                 startActivity(i);


            }

        });
    }

    public void MostraTexto(View view) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.putExtra(i.EXTRA_SUBJECT, "Informações Covid 19");
        i.putExtra(i.EXTRA_TEXT, "Cuidados necessários ao chegar em casa: \n" +
                "Não toque em nada, antes de se higienizar. \n" +
                "Retire os sapatos.\n" +
                "Desinfete as patas do seu pet após passear com ele.\n" +
                "Tire a roupa e coloque-a em uma sacola plástica no cesto de roupas. Lave-as!\n");
        i.setType("text/plain");
        startActivity(i);

    }
}