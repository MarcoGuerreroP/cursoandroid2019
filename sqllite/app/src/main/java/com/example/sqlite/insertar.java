package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class insertar extends AppCompatActivity {
    basededatos myDb;
    EditText nombre, apellido, password;
    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertar);

        nombre = (EditText)findViewById(R.id.edt_pass);
        apellido = (EditText)findViewById(R.id.edt_pass);
        password = (EditText)findViewById(R.id.edt_pass);
        boton = (Button)findViewById(R.id.btn_insertar1);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = nombre.getText().toString();
                String surname = apellido.getText().toString();
                String marks = password.getText().toString();
                Boolean result = myDb.insertData(name, surname ,marks);
                if ( result == true){

                    Toast.makeText(getApplicationContext(),"Data Inserted Succededfull")


                }else{
                    Toast.makeText(getApplicationContext(),"Data Insertion Failed")
                }
            }
        });






    }//Metodo onCreate
}//Metodo Main
