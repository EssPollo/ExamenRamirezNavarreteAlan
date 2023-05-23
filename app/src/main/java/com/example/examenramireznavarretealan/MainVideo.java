package com.example.examenramireznavarretealan;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainVideo extends AppCompatActivity {
    public VideoView vvVideoRN;
    public Button btnReproducir;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_video);
        vvVideoRN= findViewById(R.id.vvVideo);
        btnReproducir = findViewById(R.id.btnReproducir);
        //para reproducir video
        Uri path = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);//recursos externos
        MediaController mc = new MediaController(this);//instancia para controles de video y reproduccion
        vvVideoRN.setMediaController(mc);//Coloca los botones de reprocur, pausa y detener
        vvVideoRN.setVideoURI(path);//llamado del URI es para identificar el cursos video a reproducir
        vvVideoRN.setMediaController(new MediaController(this));//Integra los controles y el recurso URI
        vvVideoRN.start();//ejecucion
    }
}