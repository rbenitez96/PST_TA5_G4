package com.example.amst4;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Inicio extends AppCompatActivity {

    private static String usuario = "AMST4",contra = "amst4";
    EditText usuarioT, passT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        usuarioT = findViewById(R.id.editTextUser);
        passT = findViewById(R.id.editTextPass);
    }

    public void sesion(View v){
        final String user = usuarioT.getText().toString();
        final String pass = passT.getText().toString();
        if ((user.equals(usuario)) && (pass.equals(contra))){
            Intent i = new Intent(this,SuperHeroes.class);
            i.putExtra("usuario",user);
            startActivity(i);
            Inicio.this.finish();
        }
        else{
            Toast.makeText(Inicio.this, "usuario y/o contrasena INCORRECTA", Toast.LENGTH_SHORT).show();
            usuarioT.setText("");
            passT.setText("");
        }
    }

}
