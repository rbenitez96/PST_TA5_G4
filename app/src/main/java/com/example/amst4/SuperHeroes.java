package com.example.amst4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SuperHeroes extends AppCompatActivity {

    private TextView user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_super_heroes);
        Intent i = this.getIntent();
        user = findViewById(R.id.textViewUs);
        String nombre = i.getStringExtra("usuario");
        user.setText(nombre);
    }

    public void pagina_Hulk(View v){
        Intent i = new Intent(this,Hulk.class);
        startActivity(i);
    }

    public void pagina_Deadpool(View v){
        Intent i = new Intent(this,Deadpool.class);
        startActivity(i);
    }

    public void pagina_Thor(View v){
        Intent i = new Intent(this,Thor.class);
        startActivity(i);
    }

    public void pagina_Ironman3(View v){
        Intent i = new Intent(this,Ironman3.class);
        startActivity(i);
    }

    public void pagina_Spiderman(View v){
        Intent i = new Intent(this,Spiderman.class);
        startActivity(i);
    }

    public void pagina_DocStrange(View v){
        Intent i = new Intent(this,DocStrange.class);
        startActivity(i);
    }

}
