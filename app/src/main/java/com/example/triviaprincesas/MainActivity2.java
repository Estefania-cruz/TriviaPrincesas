package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Button boton;
    RadioButton respuesta1, respuesta2, respuesta3;

    int puntuacion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String nombre = getIntent().getStringExtra("nombre");

        boton = this.findViewById(R.id.btnSigue);
        respuesta1 = this.findViewById(R.id.radioButton4);
        respuesta2 = this.findViewById(R.id.radioButton5);
        respuesta3 = this.findViewById(R.id.radioButton6);

        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntuacionRespuesta();
                if(puntuacionRespuesta()){
                    Intent intent = new Intent(MainActivity2.this, PreguntaActivity3.class);
                    intent.putExtra("nombre", nombre);
                    intent.putExtra("puntuacion", String.valueOf(puntuacion));
                    startActivity(intent);
                    finish();
                }else{
                    //
                }
            }
        });
    }

    private boolean puntuacionRespuesta(){
        if(respuesta1.isChecked()){
            puntuacion = 5;
            return true;
        }else if(respuesta2.isChecked()){
            puntuacion = 7;
            return true;
        }else if(respuesta3.isChecked()){
            puntuacion = 1;
            return true;
        }
        return false;
    }
}