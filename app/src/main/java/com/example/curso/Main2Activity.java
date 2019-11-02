package com.example.curso;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView texto2 = (TextView)findViewById(R.id.txt_compo);
        String valorExtraido;
        valorExtraido = getIntent().getExtras().getString("Valor");
        texto2.setText(valorExtraido);







    }
}
