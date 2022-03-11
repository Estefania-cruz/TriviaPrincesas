package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreguntaActivity4 extends AppCompatActivity {
    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta4);

        String nombre = getIntent().getStringExtra("nombre");

        boton = (Button) findViewById(R.id.btnCuarto);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreguntaActivity4.this, PreguntaActivity5.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });

    }
}