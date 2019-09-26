package com.christian.projetodontpad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void irParaFotos(View view){
        FrameLayout flf = findViewById(R.id.frameFotos);
        FrameLayout flt =  findViewById(R.id.frameText);
        flf.setVisibility(View.VISIBLE);
        flt.setVisibility(View.GONE);
    }


    public void irParaTexto(View view){
        FrameLayout flf = findViewById(R.id.frameFotos);
        FrameLayout flt = findViewById(R.id.frameText);
        flf.setVisibility(View.GONE);
        flt.setVisibility(View.VISIBLE);

    }




}
