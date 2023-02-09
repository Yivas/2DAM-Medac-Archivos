package com.example.apandroidmysqlphp;

import android.os.Bundle;
import android.os.DropBoxManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText idEditText;
    private EditText nameEditText;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        idEditText = findViewById(R.id.id_edittext);
        nameEditText = findViewById(R.id.name_edittext);
        addButton = findViewById(R.id.add_button);

        addButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = Integer.parseInt(idEditText.getText().toString());
        String name = nameEditText.getText().toString();
        // Agregue un nuevo elemento a la base de datos
        DatabaseOperations databaseOperations = new DatabaseOperations(this);
        databaseOperations.insertData(name, id);
        Toast.makeText(this, "Agregado", Toast.LENGTH_SHORT).show();

        // Finalice la actividad después de agregar un elemento
        finish();
    }
}