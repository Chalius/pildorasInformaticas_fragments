package com.example.pildorasinformaticas_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ActividadHerramientas extends AppCompatActivity implements ComunicaMenu{

    Fragment[] misFragmentos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_herramientas);


        misFragmentos = new Fragment[3];

        misFragmentos[0] = new Linterna();
        misFragmentos[1] = new Musica();
        misFragmentos[2] = new Nivel();


        Bundle extras = getIntent().getExtras();

        menu(extras.getInt("BOTONPULSADO"));
    }

    @Override
    public void menu(int queboton) {

        FragmentManager miManejador = getSupportFragmentManager();
        FragmentTransaction miTransaccion = miManejador.beginTransaction();
        miTransaccion.replace(R.id.herramientas, misFragmentos[queboton]);
        miTransaccion.commit();



    }
}
