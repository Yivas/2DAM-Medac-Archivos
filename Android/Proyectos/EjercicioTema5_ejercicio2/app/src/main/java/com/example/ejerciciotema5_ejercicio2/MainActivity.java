package com.example.ejerciciotema5_ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textViewNombre;
    private EditText editTextNumberEdad;
    private TextView textViewBienvenida;

    private Button buttonResultado;

    private ImageView imageViewImagen;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewNombre = findViewById(R.id.textView_nombre);
        editTextNumberEdad = findViewById(R.id.editTextNumber_edad);
        textViewBienvenida = findViewById(R.id.textView_bienvenida);
        buttonResultado = findViewById(R.id.button_resultado);
        imageViewImagen = findViewById(R.id.imageView_imagen);

        buttonResultado.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_resultado:
                if (!editTextNumberEdad.getText().toString().equals("")) {
                    int edad = Integer.parseInt(editTextNumberEdad.getText().toString());
                    if (edad < 10) {
                        imageViewImagen.setImageResource(R.drawable.bebe);
                        textViewBienvenida.setText("");
                    } else if (10 <= edad && edad <= 18) {
                        imageViewImagen.setImageResource(R.drawable.juguete);
                        String textoBienvenida = "Bienvenido " + textViewNombre.getText().toString();
                        textViewBienvenida.setText(textoBienvenida);
                    } else if (18 <= edad && edad <= 65) {
                        imageViewImagen.setImageResource(R.drawable.casa);
                        String textoBienvenida = "Bienvenido " + textViewNombre.getText().toString();
                        textViewBienvenida.setText(textoBienvenida);
                    } else {
                        imageViewImagen.setImageResource(R.drawable.baraja);
                        String textoBienvenida = "Bienvenido " + textViewNombre.getText().toString();
                        textViewBienvenida.setText(textoBienvenida);
                    }
                }

        }

    }




}