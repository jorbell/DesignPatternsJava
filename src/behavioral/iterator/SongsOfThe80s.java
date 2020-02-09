package behavioral.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class SongsOfThe80s implements SongIterator{
    //ArrayList<SongInfo> bestSongs;
    SongInfo[] bestSongs;
    int arrayValue = 0;

    public SongsOfThe80s(){
        //bestSongs = new ArrayList<SongInfo>();
        bestSongs = new SongInfo[3];
        addSong("Never Gonna GIve You Up", "Rick Astley", 1983);
        addSong("Cruel SUmmer", "Bananarama", 1981);
        addSong("Head Over Heesl", "Tears for Fears", 1971);
    }
    public void addSong(String songName, String bandName, int yearReleased){
        SongInfo songinfo = new SongInfo(songName, bandName, yearReleased);
        //bestSongs.add(songinfo);
        bestSongs[arrayValue] = songinfo;
        arrayValue++;
    }

    public Iterator<?> createIterator() {
        // TODO Auto-generated method stub

        return Arrays.asList(bestSongs).iterator();

    }

}
