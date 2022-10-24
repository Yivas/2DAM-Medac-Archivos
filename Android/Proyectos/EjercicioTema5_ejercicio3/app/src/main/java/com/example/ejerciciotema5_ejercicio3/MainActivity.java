package com.example.ejerciciotema5_ejercicio3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextSueldo;
    private EditText editTextIRPF;

    private Button buttonCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextSueldo = findViewById(R.id.editText_sueldo);
        editTextIRPF = findViewById(R.id.editText_IRPF);
        buttonCalcular = findViewById(R.id.button_calcular);

        buttonCalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_calcular:
                if (!editTextSueldo.getText().toString().equals("")) {
                    int sueldo = Integer.parseInt(editTextSueldo.getText().toString());
                    String resultado = "";
                    if (sueldo < 20000) {
                        resultado = "10%";
                    } else if (sueldo > 20000 && sueldo < 30000) {
                        resultado = "20%";
                    } else if (sueldo > 30000 && sueldo < 60000) {
                        resultado = "35%";
                    } else {
                        resultado = "50%";
                    }
                    editTextIRPF.setText(resultado);
                }


        }
    }




}