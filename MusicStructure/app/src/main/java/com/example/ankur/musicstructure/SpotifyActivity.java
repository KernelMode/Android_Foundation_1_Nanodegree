package com.example.ankur.musicstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

// Imported them to show that the lib has been successfully added to the project
import com.spotify.sdk.android.authentication.AuthenticationClient;
import com.spotify.sdk.android.authentication.AuthenticationRequest;
import com.spotify.sdk.android.authentication.AuthenticationResponse;

public class SpotifyActivity extends AppCompatActivity {

    boolean clickedEmail = false;
    boolean clickedPass = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotify);
        setTitle("Spotify");

        final EditText email = findViewById(R.id.email);
        email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!clickedEmail) {
                    email.setText("");
                    clickedEmail = true;
                }//To remove default text only once when user clicks the box to enter email
            }
        });

        final EditText password = findViewById(R.id.password);
        password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!clickedPass) {
                    password.setText("");
                    clickedPass = true;
                }
            }
        });

        final Button nowPlaying = findViewById(R.id.nowPBSpotify);
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nowIntent = new Intent(SpotifyActivity.this,NowPlaying.class);
                startActivity(nowIntent);
            }
        });


        Button songsButton = findViewById(R.id.songsBSpotify);
        songsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent songs = new Intent(SpotifyActivity.this,SongActivity.class);
                startActivity(songs);
            }
        });

        Button albumsButton = findViewById(R.id.albumsBSpotify);
        albumsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent albums = new Intent(SpotifyActivity.this,AlbumActivity.class);
                startActivity(albums);
            }
        });

        // Authenticate with the lib when login is clicked........
        // to be continued.................

    }
}
