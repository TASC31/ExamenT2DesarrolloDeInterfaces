package com.example.a21744345.noplanetb;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.mikhaellopez.circularimageview.CircularImageView;

public class BSplash extends AppCompatActivity {

    private ImageView fonfo;
    private TextView tvtitulo;
    private TextView tvsub;
    private CircularImageView logo;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);

        fonfo = findViewById(R.id.imageView);
        logo = findViewById(R.id.ivLogo);
        tvtitulo = findViewById(R.id.tvTitulo);
        tvsub = findViewById(R.id.tvAbajo);
        //esto es para importar la fuente de la carpeta font
        Typeface fuentecita = getResources().getFont(R.font.bromello);
        //esto es para poner la fuente a lo que el pida, en este caso el subtitulo
        tvsub.setTypeface(fuentecita); // con esto ya se le aplica la fuente

        Glide.with(this)
                .load(R.drawable.planetearth)
                .apply(new RequestOptions()

//                        .override(50, 50)
                                .centerCrop()
                                .diskCacheStrategy(DiskCacheStrategy.ALL)
                )
                .into(fonfo);


        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.shake);
        logo.startAnimation(myanim);
        openApp(true);
    }


    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
    }

