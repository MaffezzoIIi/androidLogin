package com.senai.atividadenavegao;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class TelaCadastro extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        Button btnCancelar = (Button) findViewById(R.id.btn_cancelar_cadastro);
        btnCancelar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent it = new Intent(this, MainActivity.class);
        startActivity(it);
    }
}
