package com.example.apandroidmysqlphp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DeleteActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText idEditText;
    private Button deleteButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        idEditText = findViewById(R.id.id_edittext);
        deleteButton = findViewById(R.id.delete_button);
        deleteButton.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        int id = Integer.parseInt(idEditText.getText().toString());
        // Elimine el elemento con el id dado de la base de datos
        DatabaseOperations databaseOperations = new DatabaseOperations(this);
        databaseOperations.deleteData(id);

        // Finalice la actividad después de eliminar un elemento
        finish();
    }
}