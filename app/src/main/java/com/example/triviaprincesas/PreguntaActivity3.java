package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PreguntaActivity3 extends AppCompatActivity {
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);

        String nombre = getIntent().getStringExtra("nombre");

        boton = (Button) findViewById(R.id.btnTercer);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreguntaActivity3.this, PreguntaActivity4.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });

    }

}