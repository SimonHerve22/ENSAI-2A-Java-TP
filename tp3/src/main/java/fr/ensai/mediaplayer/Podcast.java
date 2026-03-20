package fr.ensai.mediaplayer;

public class Podcast extends Media {
    private String host;
    private String topic;
    private String subtitles;

    /**
     * Constructs a new Podcast object.
     *
     * @param title    The title of the podcast.
     * @param host     The host of the podcast.
     * @param title    The title of the podcast.
     * @param year     The year the podcast was released.
     * @param duration The duration of the podcast in seconds.
     * @param subtitles The subtitles of the podcast.
     */
    public Podcast(String title, String host, String topic, int duration, int year, String subtitles) {
        super(title, duration, year);
        this.host = host;
        this.topic = topic;
        this.subtitles = subtitles;
    }

    /**
     * String representation of the Podcast.
     */
    @Override
    public String toString() {
        return String.format("Podcast %s by %s", this.getTitle(), this.host);
    }

    /**
     * Prints each word of subtitles, like the code recites the podcast
     */
    public void play(){
        String[] wordList = subtitles.split(" ");
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
