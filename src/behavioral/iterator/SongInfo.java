package behavioral.iterator;

public class SongInfo{
    String songName;
    String bandName;
    int yearReleased;

    public SongInfo(String newSongName, String newBandName, int newYearReleased){
        songName = newSongName;
        bandName = newBandName;
        yearReleased = newYearReleased;
    }

    /**
     * @return the songName
     */
    public String getSongName() {
        return songName;
    }

    /**
     * @return the bandName
     */
    public String getBandName() {
        return bandName;
    }

    /**
     * @return the yearReleased
     */
    public int getYearReleased() {
        return yearReleased;
    }

}
