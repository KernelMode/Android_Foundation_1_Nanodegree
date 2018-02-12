package com.example.ankur.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SongActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_song);
        setTitle("Songs");

        Button nowPlaying = findViewById(R.id.nowPBSongs);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowplayingIntent = new Intent(SongActivity.this,NowPlaying.class);
                startActivity(nowplayingIntent);
            }
        });

        Button albumsButton = findViewById(R.id.albumsBSongs);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albumsIntent = new Intent(SongActivity.this,AlbumActivity.class);
                startActivity(albumsIntent);
            }
        });

        Button spotifyButton = findViewById(R.id.spotifyBSongs);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotifyIntent = new Intent(SongActivity.this,SpotifyActivity.class);
                startActivity(spotifyIntent);
            }
        });
    }
}
