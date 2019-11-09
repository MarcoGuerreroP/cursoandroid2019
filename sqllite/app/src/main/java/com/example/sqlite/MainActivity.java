package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button insertar, eliminar, leer, modificar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        insertar = (Button)findViewById(R.id.btn_insertar1);
        insertar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent new Intent(getApplicationContext(),insertar.class);
                startActivity(intent);
            }
        });

        eliminar = (Button)findViewById(R.id.btn_eliminar);
        eliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent = intent new Intent(getApplicationContext(),eliminar.class);
                startActivity(intent);
            }
        });

        leer = (Button)findViewById(R.id.btn_leer);
        leer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent = intent new Intent (getApplicationContext(),leer.class);
                startActivity(intent);
            }
        });

        modificar = (Button)findViewById(R.id.btn_modificar);
        modificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent = intent new Intent(getApplicationContext(), modificar.class);
                startActivity(intent);
            }
        });





    }

}
