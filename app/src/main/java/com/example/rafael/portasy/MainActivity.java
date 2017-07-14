package com.example.rafael.portasy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infoMorador(View view) {
        startActivity(new Intent(this, QRCodeActivity.class));
    }

    public void porteiro_inicio_menu(View view) {
        startActivity(new Intent(this, MainMenuActivity.class));
    }
}
