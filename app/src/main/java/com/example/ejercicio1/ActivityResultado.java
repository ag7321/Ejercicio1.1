package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResultado extends AppCompatActivity {
    TextView txtVer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtVer = (TextView) findViewById(R.id.txtVer);

        String resultado = getIntent().getStringExtra("resultado");

        txtVer.setText("El resultado de la operacion es:  "+resultado);
    }
}