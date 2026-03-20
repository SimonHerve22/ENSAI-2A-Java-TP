package fr.ensai.mediaplayer;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Represents a song with essential attributes.
 */
public class Song extends Media{
    private Artist singer;
    private String lyrics;
    private Artist author;
    private Artist composer;
    private MusicalGenres[] styles;

    /**
     * Constructs a new Song object.
     *
     * @param title    The title of the song.
     * @param singer   The singer of the song.
     * @param title    The title of the song.
     * @param year     The year the song was released.
     * @param duration The duration of the song in seconds.
     * @param lyrics   The lyrics of the song.
     * @param author   The author of the song.
     * @param composer The composer of the song.
     */
    public Song(String title, Artist singer, int year, int duration, String lyrics, Artist author, Artist composer, MusicalGenres[] styles) {
        super(title, duration, year);
        this.singer = singer;
        this.lyrics = lyrics;
        this.author = author;
        this.composer = composer;
        this.styles = styles;
    }

    /**
     * String representation of the Song.
     */
    @Override
    public String toString() {
        return String.format("Song %s by %s %s",this.getTitle(), this.singer.getfirstName(), this.singer.getlastName());
    }
    
    /**
     * Indicates whether some other object is "equal to" this one. Two Song
     * objects are considered equal if they have the same title, singer, and year.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Song otherSong = (Song) o;
        return this.getYear() == otherSong.getYear() &&
                Objects.equals(this.getTitle(), otherSong.getTitle()) &&
                Objects.equals(this.singer, otherSong.singer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getTitle(), this.singer, this.getYear());
    }
    /**
     * Prints each word of lyrics, like the code sings the music
     */
    public void play(){
        String[] wordList = lyrics.split(" ");
        for (String i : wordList){
            System.out.println(i);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Thread was interrupted");
        }
        }
    }

}