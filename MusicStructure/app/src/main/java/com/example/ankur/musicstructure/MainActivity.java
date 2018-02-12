package com.example.ankur.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout nowPlaying = findViewById(R.id.nowPlayingLayout);
        nowPlaying.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent nowPlayingIntent = new Intent(MainActivity.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        LinearLayout songs = findViewById(R.id.songsLayout);
        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(MainActivity.this,SongActivity.class);
                startActivity(songs);
            }
        });

        LinearLayout albums = findViewById(R.id.albumsLayout);
        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(MainActivity.this,AlbumActivity.class);
                startActivity(albumsIntent);
            }
        });

        LinearLayout spotify = findViewById(R.id.spotifyLayout);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotifyIntent = new Intent(MainActivity.this,SpotifyActivity.class);
                startActivity(spotifyIntent);
            }
        });

        LinearLayout buyPremium = findViewById(R.id.buyLayout);
        buyPremium.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent buyIntent = new Intent(MainActivity.this,PaymentActivity.class);
                startActivity(buyIntent);
            }
        });

    }
}
