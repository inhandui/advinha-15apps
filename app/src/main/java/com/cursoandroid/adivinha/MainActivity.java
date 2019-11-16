package com.cursoandroid.adivinha;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btb_jogar;
    private TextView txt_numeros;
    private Random random;
    private int numeroRand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btb_jogar = findViewById(R.id.btn_jogar);
        txt_numeros = findViewById(R.id.txt_numeros);

        random = new Random();

        btb_jogar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numeroRand = random.nextInt(10);
                txt_numeros.setText(getString(R.string.numero_escolhido) + " "+ numeroRand);
            }
        });
    }
}
