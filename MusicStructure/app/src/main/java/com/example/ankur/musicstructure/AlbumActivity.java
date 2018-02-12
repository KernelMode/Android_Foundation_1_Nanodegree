package com.example.ankur.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AlbumActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_album);
        setTitle("Albums");

        final Button nowPlaying = findViewById(R.id.nowPBAlbums);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowPlayingIntent = new Intent(AlbumActivity.this,NowPlaying.class);
                startActivity(nowPlayingIntent);
            }
        });

        Button songsButton = findViewById(R.id.songsBAlbums);
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(AlbumActivity.this,SongActivity.class);
                startActivity(songs);
            }
        });

        Button spotifyButton = findViewById(R.id.spotifyBAlbums);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotify = new Intent(AlbumActivity.this,SpotifyActivity.class);
                startActivity(spotify);
            }
        });

    }
}
