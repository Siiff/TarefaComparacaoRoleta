package com.example.aula0103_tarefa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textParabens;
    private EditText aposta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aposta = findViewById(R.id.inputnumero);
        textParabens = findViewById(R.id.caixaparabens);
    }


    public void RodaODado(View view){
        TextView RodandoODado = findViewById(R.id.numeroArodar);
        int randomnumber = new Random().nextInt(11);
        RodandoODado.setText("Número: " + randomnumber);

        String numeroAposta;
        numeroAposta = aposta.getText().toString();

        Boolean campoValidado = validarcampo(numeroAposta);
        if(campoValidado){
            Double doubleDaAposta = Double.parseDouble(numeroAposta);
            if(doubleDaAposta == randomnumber){
                textParabens.setText("Parabens, Você Ganhou");
            }
            else {
                textParabens.setText("Você perdeu, que peninha");
            }
        }
        else {
            textParabens.setText("Faça sua Aposta primeiro!");
        }

    }
    public Boolean validarcampo (String apostaJogador){
        Boolean campoValidado = true;
        if(apostaJogador == null || apostaJogador.equals("")){
            campoValidado = false;
        }
        return  campoValidado;
    }

}