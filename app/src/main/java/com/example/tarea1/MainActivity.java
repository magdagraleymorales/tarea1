package com.example.tarea1;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    EditText cuadratico,lineal,independiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    cuadratico= (EditText)findViewById(R.id.TCuadratico);
    lineal=(EditText)findViewById(R.id.TLineal);
    independiente= (EditText)findViewById(R.id.TIndependiente);

    }
    public void ecuacion(View view){

        double r1, r2;


        double a = Double.parseDouble(cuadratico.getText().toString());
        double b = Double.parseDouble(lineal.getText().toString());
        double c = Double.parseDouble(independiente.getText().toString());


        double d= (4*a)*c;
        double e = Math.pow(b,2);
        double f=d*e;
        double g=Math.sqrt(f);

        if(g<=0){

            Toast.makeText(this,"no hay solucion",Toast.LENGTH_LONG).show();


        }
        else{

            double b_negativo= b*(-1);
              double h=2*a;

            r1 = ( b_negativo + g)/h;

            r2 = ( b_negativo - g)/h;

          Toast.makeText(this,"Solucion 1 : "+r1+" solucion 2 :"+r2,Toast.LENGTH_LONG).show();

        }
    }
}
