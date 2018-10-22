package com.example.lia.musicalstructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Find the View that shows the genres category
        TextView genres = (TextView) findViewById(R.id.genres);
        // Set a click listener on that View
        genres.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the genres View is clicked on.
            @Override
            public void onClick(View view) {
                Intent genresIntent = new Intent(MainActivity.this, GenresActivity.class);
                startActivity(genresIntent);
            }
        });
        // Find the View that shows the artists category
        TextView artists = (TextView) findViewById(R.id.artists);
        // Set a click listener on that View
        artists.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ArtistsActivity}
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                // Start the new activity
                startActivity(artistsIntent);
            }
        });
        // Find the View that shows the shop category
        TextView shop = (TextView) findViewById(R.id.shop);
        // Set a click listener on that View
        shop.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the shop category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShopActivity}
                Intent shopIntent = new Intent(MainActivity.this, ShopActivity.class);
                // Start the new activity
                startActivity(shopIntent);
            }
        });
        // Find the View that shows the nowPlaying category
        TextView nowPlaying = (TextView) findViewById(R.id.nowPlaying);
        // Set a click listener on that View
        nowPlaying.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the artists category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NowPlayingActivity}
                Intent nowPlayingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                // Start the new activity
                startActivity(nowPlayingIntent);
            }
        });
    }
}



