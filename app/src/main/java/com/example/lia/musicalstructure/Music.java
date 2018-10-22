package com.example.lia.musicalstructure;
/**
 * Created by Lia on 2018.04.22..
 */
public class Music {
    /** Default  for the title */
private String mTitleName;
    /** Default for the name */
    private String mArtistName;
    /**
     * Create a new Music object.
     *
     * @param titleName
     * @param artistName
     */
    public Music(String titleName, String artistName) {
        mTitleName = titleName;
        mArtistName = artistName;
    }
    public String getTitleName() {
        return mTitleName;
    }
    public String getArtistName() {
        return mArtistName;
    }
}

