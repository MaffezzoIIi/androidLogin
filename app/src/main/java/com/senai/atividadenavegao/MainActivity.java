package com.senai.atividadenavegao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_cadastro = (Button) findViewById(R.id.button_cadastrar);
        button_cadastro.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, TelaCadastro.class);
        startActivity(it);
    }
}