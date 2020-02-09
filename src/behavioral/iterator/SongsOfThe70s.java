package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class SongsOfThe70s implements SongIterator{
    ArrayList<SongInfo> bestSongs;

    public SongsOfThe70s(){
        bestSongs = new ArrayList<SongInfo>();
        addSong("Imagine", "John Lennon", 1971);
        addSong("American Pie", "Don McLean", 1971);
        addSong("I Will Survive", "Gloria Gaynor", 1971);
    }
    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songinfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.add(songinfo);
    }

    /*
    public ArrayList<SongInfo> getBestSongs(){
        return bestSongs;
    }
    */

    public Iterator<?> createIterator() {
        // TODO Auto-generated method stub

        return bestSongs.iterator();

    }

}
