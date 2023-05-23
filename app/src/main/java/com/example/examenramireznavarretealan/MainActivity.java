package com.example.examenramireznavarretealan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public EditText etContrasenaRN;
    public Button btnEntrarRN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etContrasenaRN=findViewById(R.id.etContrasena);
        btnEntrarRN = findViewById(R.id.btnEntrar);

        btnEntrarRN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etContrasenaRN.getText().toString().equals("123")){
                    Intent intent1 = new Intent(view.getContext(),MainVideo.class);
                    startActivityForResult(intent1,0);

                }else{
                    Toast.makeText(MainActivity.this,"UContraseña incorrectos\nContraseña: 123!!",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}