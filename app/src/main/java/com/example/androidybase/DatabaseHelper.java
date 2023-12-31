package com.example.androidybase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "AndroidBase";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crear la tabla CLIENTE
        db.execSQL("CREATE TABLE IF NOT EXISTS CLIENTE (" +
                "id_cliente INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nombre_cliente TEXT," +
                "apellido TEXT," +
                "nombre_usuario TEXT," +
                "contraseña CHAR(12)," +
                "direccion VARCHAR(100)," +
                "telefono VARCHAR(15)," +
                "email VARCHAR(100) UNIQUE," +
                "fechaRegistro TIMESTAMP DEFAULT CURRENT_TIMESTAMP" +
                ")");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
