package behavioral.iterator;

import java.util.Iterator;

public class DiscJockey {
    SongsOfThe70s songs70s;
    SongsOfThe80s songs80s;
    SongsOfThe90s songs90s;

    SongIterator iter70s;
    SongIterator iter80s;
    SongIterator iter90s;
    public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s){
        iter70s = newSongs70s;
        iter80s = newSongs80s;
        iter90s = newSongs90s;
    }
    public void showTheSongs(){
        Iterator<?> songs70s = iter70s.createIterator();
        Iterator<?> songs80s = iter80s.createIterator();
        Iterator<?> songs90s = iter90s.createIterator();

        System.out.println("Songs of the 80's");
        printTheSongs(songs70s);
        printTheSongs(songs80s);
        printTheSongs(songs90s);

        /*
        ArrayList<SongInfo> al70s = songs70s.getBestSongs();
        System.out.println("SongsOfThe70s");
        for(int i=0; i<al70s.size();i++){
                SongInfo bestSongs = (SongInfo) al70s.get(i);
                System.out.println(bestSongs.getSongName());
                System.out.println(bestSongs.getBandName());
                System.out.println(bestSongs.getYearReleased());
        }

        SongInfo[] al80s = songs80s.getBestSongs();
        System.out.println("SongsOfThe80s");
        for(int i=0; i<al70s.size();i++){
                SongInfo bestSongs = (SongInfo) al80s[i];
                System.out.println(bestSongs.getSongName());
                System.out.println(bestSongs.getBandName());
                System.out.println(bestSongs.getYearReleased());
        }
        Hashtable<Integer, SongInfo> al90s = songs90s.getBestSongs();
        System.out.println("SongsOfThe70s");
        for(Enumeration<Integer> e = al90s.keys();e.hasMoreElements();){
                SongInfo bestSongs = al90s.get(e.nextElement());
                System.out.println(bestSongs.getSongName());
                System.out.println(bestSongs.getBandName());
                System.out.println(bestSongs.getYearReleased());
        }
        */
    }
    public void printTheSongs(Iterator<?> songs){
        while(songs.hasNext()){
            SongInfo bestSongs = (SongInfo) songs.next();
            System.out.println(bestSongs.getSongName());
            System.out.println(bestSongs.getBandName());
            System.out.println(bestSongs.getYearReleased());
        }
    }
}
