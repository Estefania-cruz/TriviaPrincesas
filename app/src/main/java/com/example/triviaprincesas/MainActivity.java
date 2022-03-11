package com.example.triviaprincesas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.view.View;


public class MainActivity extends AppCompatActivity {
   Button btnComenzar;
   EditText editTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnComenzar = this.findViewById(R.id.btnComenzar);
        editTxt = this.findViewById(R.id.editTxt);

        btnComenzar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String t = editTxt.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("nombre", t);
                startActivity(intent);
                //Toast.makeText(MainActivity.this, t, Toast.LENGTH_SHORT).show();
            }
        });

        //Toast.makeText(MainActivity.this, "Hola Mundo", Toast.LENGTH_SHORT).show();
    }
}