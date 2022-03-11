package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreguntaActivity10 extends AppCompatActivity {

    Button boton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta10);

        String nombre = getIntent().getStringExtra("nombre");

        boton = (Button) findViewById(R.id.btnDiez);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreguntaActivity10.this, PreguntaActivity11.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });

    }
}