package com.example.estilos.tarea_chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class message extends AppCompatActivity {
    ListView conversation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        String nombre=getIntent().getExtras().getString("numero");
        setTitle(nombre);

    }
}
