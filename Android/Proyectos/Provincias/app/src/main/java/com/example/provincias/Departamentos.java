package com.example.provincias;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;

import java.io.IOException;

public class Departamentos extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_departamentos);

        LinearLayout Botonera = (LinearLayout) findViewById(R.id.layoutdepartamentos);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        String jsonFileContent = null;

        try {
            jsonFileContent = Utiles.leerJson(getApplicationContext(), );
            JSONArray jsonArray = new JSONArray(jsonFileContent);

            for (int i = 0; i < jsonArray.length(); i++) {

            }

        } catch (IOException) {

        }



    }

    @Override
    public void onClick(View view) {
        startActivity(new Intent(getApplicationContext(), Provincias.class)
                .putExtra("departamento_id", view.getId()));
    }
}
