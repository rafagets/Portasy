package com.example.rafael.portasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
    }

    public void close(View view) {
        finish();
    }

    public void detalhe_morador(View view) {
        startActivity(new Intent(this, DetalheMoradorActivity.class));
    }

    public void coletaDado(View view) {
        startActivity(new Intent(this, ColetaDadosActivity.class));
    }
}
