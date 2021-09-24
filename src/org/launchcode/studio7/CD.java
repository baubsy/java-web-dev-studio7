package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc{
    final static int MAX_SIZE = 700;
    private int capacity = 9;
    private ArrayList<String> songs;
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    public CD(int space, String title, String type) {
        super(space, title, type);
    }
    @Override
    public void spinDisc(){
        System.out.println("Spinning slow");
    }
    public void addSong(String song){
        if(capacity > 0){
            songs.add(song);
            capacity--;
        }else{
            System.out.println("cd full");
        }
    }
    public void printSongs(){
        System.out.println(songs.toString());
    }
}
