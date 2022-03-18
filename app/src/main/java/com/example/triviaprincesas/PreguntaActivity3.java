package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class PreguntaActivity3 extends AppCompatActivity {
    Button boton;
    RadioButton respuesta1, respuesta2, respuesta3;

    String puntuacionString;
    int puntuacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta3);

        //puntuacion = 0;//Integer.parseInt();

        boton = (Button) findViewById(R.id.btnTercer);
        respuesta1 = this.findViewById(R.id.radioButton);
        respuesta2 = this.findViewById(R.id.radioButton2);
        respuesta3 = this.findViewById(R.id.radioButton3);

        String nombre = getIntent().getStringExtra("nombre");
        puntuacionString = getIntent().getStringExtra("puntuacion");

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntuacionRespuesta();
                if(puntuacionRespuesta()){
                    Intent intent = new Intent(PreguntaActivity3.this, PreguntaActivity4.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("puntuacion", String.valueOf(puntuacion));
                    startActivity(intent);
                    finish();
                }else{

                }
            }
        });

    }

    private boolean puntuacionRespuesta(){
        puntuacion = Integer.parseInt(puntuacionString);

        if(respuesta1.isChecked()){
            puntuacion += 5;
            return true;
        }else if(respuesta2.isChecked()){
            puntuacion += 7;
            return true;
        }else if(respuesta3.isChecked()){
            puntuacion += 1;
            return true;
        }
        return false;
    }

}