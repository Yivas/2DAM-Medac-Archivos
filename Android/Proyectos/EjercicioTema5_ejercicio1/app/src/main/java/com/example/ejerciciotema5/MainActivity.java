package com.example.ejerciciotema5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CheckBox checkBoxSumar;
    private CheckBox checkBoxRestar;

    private TextView textNumero1;
    private TextView textNumero2;

    private EditText editTextNumero1;
    private EditText editTextNumero2;

    private TextView textResultado;
    private TextView textResultadoNumero;

    private Button buttonCalcular;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBoxSumar = findViewById(R.id.checkBox_sumar);
        checkBoxRestar = findViewById(R.id.checkBox_restar);
        textNumero1 = findViewById(R.id.text_numero2);
        editTextNumero1 = findViewById(R.id.editText_numero1);
        editTextNumero2 = findViewById(R.id.editText_numero2);
        textResultado = findViewById(R.id.text_resultado);
        textResultadoNumero = findViewById(R.id.text_resultado_numero);
        buttonCalcular = findViewById(R.id.button_calcular);

        buttonCalcular.setOnClickListener((View.OnClickListener) this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_calcular:
                if (checkBoxSumar.isChecked() && checkBoxRestar.isChecked()) {

                } else if (checkBoxSumar.isChecked()) {
                    int numero1 = Integer.parseInt(String.valueOf(editTextNumero1.getText()));
                    int numero2 = Integer.parseInt(String.valueOf(editTextNumero2.getText()));

                    textResultadoNumero.setText(String.valueOf(numero1 + numero2));
                    break;
                } else if (checkBoxRestar.isChecked()) {
                    int numero1 = Integer.parseInt(String.valueOf(editTextNumero1.getText()));
                    int numero2 = Integer.parseInt(String.valueOf(editTextNumero2.getText()));

                    textResultadoNumero.setText(String.valueOf(numero1 - numero2));
                    break;
                } else {
                    break;
                }
        }
    }


}