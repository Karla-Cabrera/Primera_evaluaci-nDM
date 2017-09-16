package com.karla.primera_evaluaciondm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class Principal extends AppCompatActivity {


    //creacion de las variables;
    private Button btnNuevo;
    private Button btnLista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        this.btnNuevo = (Button) findViewById(R.id.btnNuevo);
        this.btnLista = (Button) findViewById(R.id.btnLista);

        this.btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == findViewById(R.id.btnEncuesta).getId()) {
                    finish();

                }
            }
        });

        this.btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == findViewById(R.id.btnResultado).getId()) {

                }
            }
        });


    }
}

