package com.example.apandroidmysqlphp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class EditDataActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mEditTextName;
    private EditText mEditTextId;
    private Button mButtonUpdate;

    private DatabaseOperations databaseOperations;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        mEditTextName = findViewById(R.id.edit_nombre);
        mEditTextId = findViewById(R.id.edit_id);
        mButtonUpdate = findViewById(R.id.button_update);

        databaseOperations = new DatabaseOperations(this);

        Intent intent = getIntent();
        final int id = intent.getIntExtra("id", -1);
        String nombre = intent.getStringExtra("nombre");

        mEditTextName.setText(nombre);
        mEditTextId.setText(String.valueOf(id));
    }

    @Override
    public void onClick(View v) {
        int id = Integer.parseInt(mEditTextId.getText().toString());
        String name = mEditTextName.getText().toString();
        // Agregue un nuevo elemento a la base de datos
        databaseOperations.updateData(name, id);
        Toast.makeText(this, "Actualizado", Toast.LENGTH_SHORT).show();

        // Finalice la actividad después de agregar un elemento
        finish();
    }

}
