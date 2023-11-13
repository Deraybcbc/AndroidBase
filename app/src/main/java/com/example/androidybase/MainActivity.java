package com.example.androidybase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private SQLiteDatabase database;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtener una instancia de la base de datos
        DatabaseHelper dbHelper = new DatabaseHelper(this);
        database = dbHelper.getWritableDatabase();

    }

    private void insertarCliente(String nombre, String apellido, String nombreUsuario, String contraseña, String direccion, String telefono, String email) {
        try {
            ContentValues values = new ContentValues();
            values.put("nombre_cliente", nombre);
            values.put("apellido", apellido);
            values.put("nombre_usuario", nombreUsuario);
            values.put("contraseña", contraseña);
            values.put("direccion", direccion);
            values.put("telefono", telefono);
            values.put("email", email);

            long idCliente = database.insert("CLIENTE", null, values);

            if (idCliente != -1) {
                // La inserción fue exitosa
                // "idCliente" contiene el valor de la clave primaria del nuevo cliente
                Log.d("INSERT","INSERT EXITOSO");
            } else {
                // La inserción falló
                Log.d("INSERT","INSERT FALLIOD");
            }
        } catch (SQLException e) {
            // Manejar excepciones, por ejemplo, si hay un error de base de datos
            e.printStackTrace();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        //Mostrar y enviar a donde queremos ir
        switch (id) {
            case R.id.guardar:
                /*
                // Acción para la "Opción 1"
                Intent intent1 = new Intent(this, DadesUsuari.class);
                startActivity(intent1);
                return true;*/
        }

        return super.onOptionsItemSelected(item);
    }
}