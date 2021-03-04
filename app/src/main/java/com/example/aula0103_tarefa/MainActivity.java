package com.example.aula0103_tarefa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RodaODado(View view){
        TextView RodandoODado = findViewById(R.id.numeroArodar);
        int randomnumber = new Random().nextInt(11);
        RodandoODado.setText("Número: " + randomnumber);
    }
    public void Parabens(View view){
        TextView parabenizacao = findViewById(R.id.caixaparabens);
        parabenizacao.setText("Parabens, Você gannhou!");
    }

    public void Comparacao(View view){
        EditText numero = (EditText) findViewById(R.id.inputnumero);
        
    }


}