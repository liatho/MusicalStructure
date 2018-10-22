package com.example.lia.musicalstructure;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
/**
 * Created by Lia on 2018.04.22..
 */
public class MusicAdapter extends ArrayAdapter<Music> {/**
 * Create a new {@link MusicAdapter} object.
 *
 * @param context is the current context (i.e. Activity) that the adapter is being created in.
 * @param words is the list of {@link Music}s to be displayed.
 */
public MusicAdapter(Context context, ArrayList<Music> words) {
    super(context, 0, words);
}
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        // Get the {@link Music} object located at this position in the list
        Music currentWord = getItem(position);
        // Find the TextView in the list_item.xml layout with the ID title_text_view.
        TextView titleTextView = (TextView) listItemView.findViewById(R.id.title_text_view);
        // Get the title from the currentWord object and set this text on
        // the Title TextView.
        titleTextView.setText(currentWord.getTitleName());
        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.artist_text_view);
        // Get the default artist from the currentWord object and set this text on
        // the default TextView.
        defaultTextView.setText(currentWord.getArtistName());
        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
