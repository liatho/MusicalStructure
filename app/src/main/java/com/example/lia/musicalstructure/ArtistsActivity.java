package com.example.lia.musicalstructure;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class ArtistsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists2);
        setContentView(R.layout.music_list);
        // Create a list of names
        ArrayList<Music> words = new ArrayList<>();
        words.add(new Music("J.S. Bach", "First Work"));
        words.add(new Music("G.F. Handel", "Konzert"));
        words.add(new Music("F. Chopin", "Mazurka"));
        words.add(new Music("F. Chopin", "Violin"));
        words.add(new Music("F. Liszt", "Concert"));
        words.add(new Music("ABBA", "Money"));
        words.add(new Music("ABBA", "Chickita"));
        words.add(new Music("Boney M", "Songs"));
        words.add(new Music(getString(R.string.beatles), "All albums"));
        words.add(new Music("Queen", "Made in Heaven"));
        words.add(new Music("Metallica", "Nothing Else Matters"));
        words.add(new Music("Enya", "Celtic"));
        words.add(new Music("Enya ", "King"));
        words.add(new Music("Mobi", "Innocents"));
        words.add(new Music("Mobi", "Wait for Me"));
        words.add(new Music("Mobi", "Real"));
        // Create an {@link MusicAdapter}, whose data source is a list of {@link Music}s. The
        // adapter knows how to create list items for each item in the list.
        MusicAdapter adapter = new MusicAdapter(this, words);
        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // music_list.xml layout file.
        ListView listView = (ListView) findViewById(R.id.list);
        // Make the {@link ListView} use the {@link MusicAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Music} in the list.
        listView.setAdapter(adapter);
    }
}