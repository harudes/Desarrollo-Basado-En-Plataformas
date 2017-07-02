package com.example.estilos.tareachat;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class EditContact extends AppCompatActivity {
    EditText nombre;
    EditText apellido;
    EditText correo;
    Button editar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_contact);
        final int idContacto = Integer.parseInt(getIntent().getExtras().getString("id"));
        final DBHelper db = new DBHelper(this);
        nombre = (EditText)findViewById(R.id.input_name);
        apellido = (EditText) findViewById(R.id.input_lastname);
        correo = (EditText) findViewById(R.id.input_mail);
        editar = (Button) findViewById(R.id.edit);
        Cursor c = db.getInfoContacto(idContacto);
        c.moveToFirst();
        String nom = c.getString(c.getColumnIndex("nombre"));
        String ap = c.getString(c.getColumnIndex("apellido"));
        String email = c.getString(c.getColumnIndex("email"));
        nombre.setText(nom);
        apellido.setText(ap);
        correo.setText(email);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db.updateContacto(idContacto,nombre.getText().toString(),apellido.getText().toString(),correo.getText().toString());
                Toast.makeText(EditContact.this,"El Contacto se Actualizo Correctamente",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
