package com.example.calculadoraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText dato1, dato2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dato1 = (EditText) findViewById(R.id.edt_numero1);
        dato2 = (EditText) findViewById(R.id.edt_numero2);


    }

    public void sumar(View view) {
        int n1 = Integer.parseInt(dato1.getText().toString());
        int n2 = Integer.parseInt(dato2.getText().toString());
        int sum = n1 + n2;

        mostrar(sum);
    }


    public void resta(View view) {
        int n1 = Integer.parseInt(dato1.getText().toString());
        int n2 = Integer.parseInt(dato2.getText().toString());
        int res = n1 - n2;
        mostrar(res);
    }


    public void multiplicar(View view) {
        Double n1 = Double.parseDouble(dato1.getText().toString());
        Double n2 = Double.parseDouble(dato2.getText().toString());
        Double mul = n1 * n2;

        mostrar2(mul);
    }


    public void divicion(View view) {
        Double n1 = Double.parseDouble(dato1.getText().toString());
        Double n2 = Double.parseDouble(dato2.getText().toString());
        Double divi = n1 / n2;
        mostrar2(divi);

    }

    /**
     * Cajita de texto
     *
     */
    private void mostrar(int sum) {

        Toast.makeText(this, "Resultado es:" + sum, Toast.LENGTH_LONG).show();
    }

    private void mostrar2(double mul) {

        Toast.makeText(this, "Resultado es:" + mul, Toast.LENGTH_LONG).show();

    }
}


