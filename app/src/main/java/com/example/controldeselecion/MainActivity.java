package com.example.controldeselecion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemSelectedListener,
        AdapterView.OnItemClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //datos ingresado
        final String[] datos =
                new
                        String[]{"Elem1","Elem2","Elem3","Elem4","Elem5"};
        final String[] ListaAmigos =
                new
                        String[]{"WENDY MARGOTH ACOSTA MESTANZA","ANGEL EDUARDO GIRALDO VITE","BRITHANY MARIBEL HERRERA ROMERO",
                        "JULIO IVONIK JARAMILLO MORA","BRYAN STEVEN LARA CASTRO","GLENDA ALEXANDRA TAMAMI GONZALEZ"};
        // el daptador
        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item, datos);

        ArrayAdapter<String> adaptadorlistadeamigo =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_spinner_item,ListaAmigos);


        // asignar el adaptador a la vista (spiner)

        Spinner cmbOpciones = (Spinner) findViewById(R.id.cbLista);
         adaptador.setDropDownViewResource(
                android.R.layout.simple_spinner_dropdown_item);
        cmbOpciones.setAdapter(adaptador);
        cmbOpciones.setOnItemSelectedListener(this);

        ListView lstOpciones = (ListView)findViewById(R.id.lstLista);
        lstOpciones.setAdapter(adaptadorlistadeamigo);
        lstOpciones.setOnItemClickListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem =
                (TextView)findViewById(R.id.txtitem);
        txtItem.setText("Seleccionado: " + parent.getItemAtPosition(position));

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        TextView txtItem =(TextView)findViewById(R.id.txtitem);
        txtItem.setText("Seleccionado de Amigos: " + parent.getItemAtPosition(position));

    }
}