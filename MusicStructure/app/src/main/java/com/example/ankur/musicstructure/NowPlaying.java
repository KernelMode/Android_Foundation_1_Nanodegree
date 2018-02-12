package com.example.ankur.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

public class NowPlaying extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
        setTitle("Now Playing");
        // Click Listener on Song Image
        ImageView songImage = findViewById(R.id.songimage);
        songImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this,"The Beatles",Toast.LENGTH_SHORT).show();
            }
        });
        // Click Listener on Play/Pause Button
        ImageButton playButton = findViewById(R.id.playButton);
        playButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Toast.makeText(NowPlaying.this,"Play/Pause",Toast.LENGTH_SHORT).show();
                ProgressBar progressSong = findViewById(R.id.progressBar);
                progressSong.setProgress(progressSong.getProgress() + 50); // Just to change progress bar when play is pressed
            }
        });

        ImageButton prevButton = findViewById(R.id.previousButton);
        prevButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this,"Previous Song",Toast.LENGTH_SHORT).show();
            }
        });

        ImageButton forwButton = findViewById(R.id.forwardButton);
        forwButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(NowPlaying.this,"Next Song",Toast.LENGTH_SHORT).show();
            }
        });
        // Click Listener on Upper Menu (Songs)
        Button songsButton = findViewById(R.id.songsBNowPlay);
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(NowPlaying.this,SongActivity.class);
                startActivity(songs);
            }
        });

        Button albumsButton = findViewById(R.id.albumsBNowPlay);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albums = new Intent(NowPlaying.this,AlbumActivity.class);
                startActivity(albums);
            }
        });

        final Button spotifyButton = findViewById(R.id.spotifyBNowPlay);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent spotify = new Intent(NowPlaying.this,SpotifyActivity.class);
                startActivity(spotify);
            }
        });
    }
}
