package com.example.lia.musicalstructure;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
public class GenresActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genres2);
        setContentView(R.layout.music_list);
        // Create a list of names
        ArrayList<Music> words = new ArrayList<Music>();
        words.add(new Music("Classic", "Baroque"));
        words.add(new Music("Classic", "Romantic"));
        words.add(new Music("Pop", "Ninety"));
        words.add(new Music("Rock", "Sixty"));
        words.add(new Music("Rock", "Seventy"));
        words.add(new Music("Jazz", "Fifty"));
        words.add(new Music("Jazz", "Sixty"));
        words.add(new Music("Reggae", "Ninety"));
        words.add(new Music("Relax", "Chilly"));
        words.add(new Music("Techno", "Ninety"));
        words.add(new Music("House", "Present"));
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