package com.example.triviaprincesas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class ResActivity3 extends AppCompatActivity {
    ImageView fotoPrinces;
    TextView descripcion;
    Button btnInicio;

    String desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res3);

        String nombre = getIntent().getStringExtra("nombre");
        int puntuacion = Integer.parseInt(getIntent().getStringExtra("puntuacion"));

        fotoPrinces = this.findViewById(R.id.fotoPrincesa);
        descripcion = this.findViewById(R.id.descripcion);
        btnInicio = this.findViewById(R.id.btnInicio);

        if(puntuacion >= 12.5 && puntuacion < 25){
            //cenicienta
            desc = "Hola " + nombre + ". Según lo que nos dijiste tu eres Cenicienta. Posees las caracteristicas de la/el tipc@ nin@ que esta en casa pero por un milagro de la rosal de guadalupe llega alguien a recartarte";

            fotoPrinces.setImageResource(R.drawable.cenicienta);
            descripcion.setText(desc);
        }else if(puntuacion >= 25 && puntuacion < 37.5){
            //aurora
            desc = "Hola " + nombre
                    + "Según los resultados, tu te poareces a Aurora, te gusta dormir, y tienes el sueño pesado :0";
            fotoPrinces.setImageResource(R.drawable.aurora);
            descripcion.setText(desc);
        }else if(puntuacion >= 37.5 && puntuacion < 50){
            //Ariel
            desc = "Hola " + nombre
                    + ". Según los resultados, tu eres igual a Ariel, dispuest@ a dar la cola por amor u.u";
            fotoPrinces.setImageResource(R.drawable.ariel);
            descripcion.setText(desc);
        }else if(puntuacion >= 50 && puntuacion < 67.5){
            //rapuncel
            desc = "Hola " + nombre
                   + ". Según Los resultados obtenidos, tu eres igual a Rapunzel, te gustaria salir pero tu mamá no te deja XD";

            fotoPrinces.setImageResource(R.drawable.rapunzel);
            descripcion.setText(desc);
        }else if(puntuacion >= 67.5 && puntuacion < 75){
            //elsa
            desc = "Hola " + nombre
                    + "Según los resultados, tu eres igual a Elsa, eres un poquis diferente y te alejas de las personas que quieres :3";

            fotoPrinces.setImageResource(R.drawable.elsa);
            descripcion.setText(desc);
        }else if(puntuacion >=75 && puntuacion < 87.5){
            //Mulan
            desc = "Hola " + nombre
                    + "Según los resultados, tu eres igual a Mulan das pelea en todo lo que se te presenta y tienes un pretendiente, pero no sabes quien es jsjs";

            fotoPrinces.setImageResource(R.drawable.mulan);
            descripcion.setText(desc);
        }else if(puntuacion >= 87.5 && puntuacion <= 100){
            //bella
            desc = "Hola " + nombre
                    + "Según los resultados, tu eres igual a Bella, te gusta una bestia y hablas sol@ ;-;";

            fotoPrinces.setImageResource(R.drawable.bella);
            descripcion.setText(desc);
        }

        btnInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResActivity3.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}