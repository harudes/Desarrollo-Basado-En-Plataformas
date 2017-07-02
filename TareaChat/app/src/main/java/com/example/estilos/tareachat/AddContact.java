package com.example.estilos.tareachat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContact extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText correo;
    Button editar;
    Button regresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);
        final DBHelper db = new DBHelper(this);
        nombre = (EditText)findViewById(R.id.input_name);
        apellido = (EditText) findViewById(R.id.input_lastname);
        correo = (EditText) findViewById(R.id.input_mail);
        editar = (Button) findViewById(R.id.edit);
        regresar = (Button)findViewById(R.id.Return);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.insertarContacto(nombre.getText().toString(),apellido.getText().toString(),correo.getText().toString());
                Toast.makeText(AddContact.this,"El Contacto se Inserto Correctamente",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
