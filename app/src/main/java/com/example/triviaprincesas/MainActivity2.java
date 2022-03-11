package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity2 extends AppCompatActivity {
    Button boton;
    RadioButton respuesta1, respuesta2, respuesta3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nombre = getIntent().getStringExtra("nombre");

        boton = this.findViewById(R.id.btnSigue);
        //respuesta1 = this.findViewById(R.id.);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //puntuacionRespuesta(respuestas.getCheckedRadioButtonId());

                Intent intent = new Intent(MainActivity2.this, PreguntaActivity3.class);
                intent.putExtra("nombre", nombre);
                startActivity(intent);
            }
        });
    }

    /*private int puntuacionRespuesta(int id){
        switch (id){
            case 's':
        }
        return 0;
    }*/
}