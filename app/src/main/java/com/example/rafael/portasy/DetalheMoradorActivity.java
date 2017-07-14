package com.example.rafael.portasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class DetalheMoradorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_morador);
    }

    public void coletaDadoss(View view) {
        startActivity(new Intent(this, ColetaDadosActivity.class));
    }

    public void closee(View view) {
        finish();
    }
}
