package com.example.controldeselecion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class controlslecion2 extends AppCompatActivity {
    public Noticia[] noticias =
            new Noticia[]{
                    new Noticia("Noticia 1", "SubNoticia Contenido Contenido Contenido Contenido 1"),
                    new Noticia("Noticia 2", "SubNoticia Contenido Contenido Contenido Contenido 2"),
                    new Noticia("Noticia 3", "SubNoticia Contenido Contenido Contenido Contenido 3"),
                    new Noticia("Noticia 4", "SubNoticia Contenido Contenido Contenido Contenido 4")};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate(savedInstanceState);setContentView(R.layout.activity_controlslecion2);
        AdaptadorNoticia adaptadorNoticia =new AdaptadorNoticia(this,no);
    }

}