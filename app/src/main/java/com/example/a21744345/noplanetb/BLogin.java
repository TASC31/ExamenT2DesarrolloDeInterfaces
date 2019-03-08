package com.example.a21744345.noplanetb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogin);
    }
    public void entrar(View v){
        Intent i = new Intent(BLogin.this, MainActivity.class);
        startActivity(i);
    }
}
