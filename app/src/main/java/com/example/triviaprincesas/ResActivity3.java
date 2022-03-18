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
            String desc = "Hola " + nombre + ". Según lo que nos dijiste tu eres Cenicienta. Posees las caracteristicas de la/el tipc@ nin@ que esta en casa pero por un milagro de la rosal de guadalupe llega alguien a recartarte";

            fotoPrinces.setImageResource(R.drawable.cenicienta);
            descripcion.setText(desc);
            Toast.makeText(this, "Cenicienta", Toast.LENGTH_SHORT).show();
        }else if(puntuacion >= 25 && puntuacion < 37.5){
            //aurora
            fotoPrinces.setImageResource(R.drawable.aurora);
            Toast.makeText(this, "Aurora", Toast.LENGTH_SHORT).show();
        }else if(puntuacion >= 37.5 && puntuacion < 50){
            //Ariel
            fotoPrinces.setImageResource(R.drawable.ariel);
            Toast.makeText(this, "Ariel", Toast.LENGTH_SHORT).show();
        }else if(puntuacion >= 50 && puntuacion < 67.5){
            //rapuncel
            fotoPrinces.setImageResource(R.drawable.rapunzel);
            Toast.makeText(this, "Rapuncel", Toast.LENGTH_SHORT).show();
        }else if(puntuacion >= 67.5 && puntuacion < 75){
            //elsa
            fotoPrinces.setImageResource(R.drawable.elsa);
            Toast.makeText(this, "Elsa", Toast.LENGTH_SHORT).show();
        }else if(puntuacion >=75 && puntuacion < 87.5){
            //Mulan
            fotoPrinces.setImageResource(R.drawable.mulan);
            Toast.makeText(this, "Mulan", Toast.LENGTH_SHORT).show();
        }else if(puntuacion >= 87.5 && puntuacion <= 100){
            //bella
            fotoPrinces.setImageResource(R.drawable.bella);
            Toast.makeText(this, "Bella", Toast.LENGTH_SHORT).show();
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