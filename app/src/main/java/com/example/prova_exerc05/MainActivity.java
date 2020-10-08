package com.example.prova_exerc05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btnimc, btntemp, btncalc, btnvolt, btncalctemp, btnvoltartemp;

    TextView txtcel, txtresultemp , txtAlt, txtpe, txtresult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarregarTelaPrincipal();
    }

    private void CarregarTelaPrincipal()
    {
        setContentView(R.layout.activity_main);
        btnimc = findViewById(R.id.btnimc);
        btnimc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaImc();
            }
        });

        btntemp = findViewById(R.id.btntemp);
        btntemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaTemp();
            }
        });
    }

    private void CarregarTelaImc()
    {
        setContentView(R.layout.telaimc);

        txtAlt = (TextView) findViewById(R.id.txtAlt);
        txtpe = (TextView) findViewById(R.id.txtpe);
        txtresult = (TextView) findViewById(R.id.txtresult);

        btncalc = findViewById(R.id.btncalc);
        btncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int peso = Integer.parseInt(txtpe.getText().toString());
                float altura = Float.parseFloat(txtAlt.getText().toString());

                float res = peso / (altura * altura);

                txtresult.setText(String.valueOf(res));
            }
        });

        btnvolt = findViewById(R.id.btnvolt);
        btnvolt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });

    }

    private void CarregarTelaTemp()
    {
        setContentView(R.layout.telatemp);

        txtcel = (TextView) findViewById(R.id.txtcel);
        txtresultemp = (TextView) findViewById(R.id.txtresultemp);

        btncalctemp = findViewById(R.id.btncalctemp);
        btncalctemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double tempe = Double.parseDouble(txtcel.getText().toString());

                double result = (tempe * 1.8) + 32;

                txtresultemp.setText(String.valueOf(result));

            }
        });

        btnvoltartemp = findViewById(R.id.btnvoltartemp);
        btnvoltartemp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarregarTelaPrincipal();
            }
        });

    }


}