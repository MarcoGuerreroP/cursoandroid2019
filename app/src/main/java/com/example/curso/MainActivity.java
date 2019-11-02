package com.example.curso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button boton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        boton = (Button) findViewById(R.id.btn1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            Toast.makeText(getApplicationContext(),"",Toast.LENGTH_LONG);

            }



        });
/**
 * en esta se esta aplicando un boton  y se el asigna la ciclo click para que la clase inten nos mande a otra activity
 */
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Hola com estas",Toast.LENGTH_SHORT);

                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(intent);
            }
        });


        Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "ONSTART()!!!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Hola desde reestar", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Hola desde onDestroy()!!!!!", Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Hola desde onPause", Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "hola desde onResumen", Toast.LENGTH_LONG).show();


    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "hola desde onResumen", Toast.LENGTH_LONG).show();


    }
}

