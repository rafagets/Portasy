package com.example.rafael.portasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VerificaAutorizacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verifica_autorizacao);
    }

    public void openLiberar(View view) {
        startActivity(new Intent(this, LiberarEntradaActivity.class));
    }
}
