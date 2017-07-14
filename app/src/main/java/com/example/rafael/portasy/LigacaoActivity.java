package com.example.rafael.portasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LigacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacao);
    }

    public void liberou(View view) {
        startActivity(new Intent(this, VerificaAutorizacaoActivity.class));
    }
}
