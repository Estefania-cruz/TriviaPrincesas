package com.example.triviaprincesas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ResActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_res3);

        String nombre = getIntent().getStringExtra("nombre");
    }
}