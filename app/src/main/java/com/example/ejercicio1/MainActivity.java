package com.example.ejercicio1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numero1,numero2;
    float n1,n2,total;
    Button btnSuma,btnResta,btnDivision,btnMultiplicacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = (EditText) findViewById(R.id.txtNumero1);
        numero2 = (EditText) findViewById(R.id.txtNumero2);

        btnSuma = (Button) findViewById(R.id.btnSuma);
        btnResta = (Button) findViewById(R.id.btnResta);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnMultiplicacion = (Button) findViewById(R.id.btnMultiplicacion);

        Intent intent = new Intent(getApplicationContext(), ActivityResultado.class);
            //

            btnSuma.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(vacio() == true){
                        Toast.makeText(getApplicationContext(),"Los campos no deben estar vacios", Toast.LENGTH_LONG).show();
                    }else{
                        intent.putExtra("resultado", String.valueOf(suma(n1,n2)));
                        startActivity(intent);
                    }

                }
            });

            btnResta.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(vacio() == true){
                        Toast.makeText(getApplicationContext(),"Los campos no deben estar vacios", Toast.LENGTH_LONG).show();
                    }else{
                        intent.putExtra("resultado", String.valueOf(resta(n1,n2)));
                        startActivity(intent);
                    }
                }
            });

            btnDivision.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(vacio() == true){
                        Toast.makeText(getApplicationContext(),"Los campos no deben estar vacios", Toast.LENGTH_LONG).show();
                    }else{
                        intent.putExtra("resultado", String.valueOf(division(n1,n2)));
                        startActivity(intent);
                    }
                }
            });

            btnMultiplicacion.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(vacio() == true){
                        Toast.makeText(getApplicationContext(),"Los campos no deben estar vacios", Toast.LENGTH_LONG).show();
                    }else{
                        intent.putExtra("resultado", String.valueOf(multiplicacion(n1,n2)));
                        startActivity(intent);
                    }
                }
            });



    }


    private float suma(float n1, float n2){

         n1 = Float.parseFloat(numero1.getText().toString());
         n2 = Float.parseFloat(numero2.getText().toString());

         total = n1 + n2;

        return total;
    }

    private float resta(float n1, float n2){

        n1 = Float.parseFloat(numero1.getText().toString());
        n2 = Float.parseFloat(numero2.getText().toString());

        total = n1 - n2;

        return total;
    }

    private float division(float n1, float n2){

        n1 = Float.parseFloat(numero1.getText().toString());
        n2 = Float.parseFloat(numero2.getText().toString());

        total = n1/n2;

        return total;
    }

    private float multiplicacion(float n1, float n2){

        n1 = Float.parseFloat(numero1.getText().toString());
        n2 = Float.parseFloat(numero2.getText().toString());

        total = n1*n2;

        return total;
    }

    private boolean vacio(){
        boolean va=false;
        if(numero1.getText().toString().isEmpty()||numero2.getText().toString().isEmpty()){
            va = true;
        }
        return va;
    }
}