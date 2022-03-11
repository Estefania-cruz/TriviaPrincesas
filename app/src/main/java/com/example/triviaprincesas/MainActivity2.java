package com.example.triviaprincesas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String t = getIntent().getStringExtra("nombre");
        Toast.makeText(MainActivity2.this, t, Toast.LENGTH_SHORT).show();

    }
}