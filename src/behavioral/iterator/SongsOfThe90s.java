package behavioral.iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class SongsOfThe90s implements SongIterator{
    Hashtable<Integer, SongInfo> bestSongs = new Hashtable<Integer, SongInfo>();
    int hashKey = 0;

    public SongsOfThe90s(){
        addSong("Songgy song", "The wild hearts", 1991);
        addSong("Gotta get away", "The Offsprings", 1993);
        addSong("American Jesus", "Bad Religion", 1992);
    }
    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songinfo = new SongInfo(songName, bandName, yearReleased);
        bestSongs.put(hashKey,songinfo);
        hashKey++;
    }

    public Iterator<?> createIterator() {
        // TODO Auto-generated method stub

        return bestSongs.values().iterator();

    }

}
