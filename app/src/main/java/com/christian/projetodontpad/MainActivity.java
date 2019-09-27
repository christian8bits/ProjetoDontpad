package com.christian.projetodontpad;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void irParaFotos(View view){
        FrameLayout flf = findViewById(R.id.frameFotos);
        FrameLayout flt = findViewById(R.id.frameText);
        FrameLayout fli = findViewById(R.id.frameVerImage);
        flf.setVisibility(View.VISIBLE);
        flt.setVisibility(View.GONE);
        fli.setVisibility(View.GONE);
    }


    public void irParaTexto(View view){
        FrameLayout flf = findViewById(R.id.frameFotos);
        FrameLayout flt = findViewById(R.id.frameText);
        FrameLayout fli = findViewById(R.id.frameVerImage);
        flf.setVisibility(View.GONE);
        fli.setVisibility(View.GONE);
        flt.setVisibility(View.VISIBLE);
    }


    public void irVerFoto(View view) {
        FrameLayout flf = findViewById(R.id.frameFotos);
        FrameLayout flt = findViewById(R.id.frameText);
        FrameLayout fli = findViewById(R.id.frameVerImage);
        flf.setVisibility(View.GONE);
        flt.setVisibility(View.GONE);
        fli.setVisibility(View.VISIBLE);
        ImageView img = findViewById(R.id.imageViewFull);
        ImageView img3 = findViewById(R.id.imageView1);
        img.setImageDrawable(img3.getDrawable());
    }


    public void irVerFoto2(View view) {
        FrameLayout flf = findViewById(R.id.frameFotos);
        FrameLayout flt = findViewById(R.id.frameText);
        FrameLayout fli = findViewById(R.id.frameVerImage);
        flf.setVisibility(View.GONE);
        flt.setVisibility(View.GONE);
        fli.setVisibility(View.VISIBLE);
        ImageView img = findViewById(R.id.imageViewFull);
        ImageView img3 = findViewById(R.id.imageView2);
        img.setImageDrawable(img3.getDrawable());
    }



}
