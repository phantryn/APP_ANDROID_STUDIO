package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText etNumero1, etNumero2;
    Button btnPrincipal;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNumero1 = findViewById(R.id.etNumero1);
        etNumero2= findViewById(R.id.etNumero2);
        btnPrincipal = findViewById(R.id.btnPrincipal);
        tvResultado = findViewById(R.id.tvResultado);


        btnPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double numero1= Double.parseDouble(etNumero1.getText().toString());
                double numero2= Double.parseDouble(etNumero2.getText().toString());
                        double Resultado= numero1+numero2;

               tvResultado.setText(""+Resultado);

            }
        });

    }
}