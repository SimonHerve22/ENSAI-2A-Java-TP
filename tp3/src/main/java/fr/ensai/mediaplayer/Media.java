package fr.ensai.mediaplayer;

public abstract class Media {
    private String title;
    private int duration;
    private int year;

    protected Media(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
    }

    /**
     * Returns the title
     */
    public String getTitle() {
        return this.title;
    }
    /**
     * Returns the year
     */
    public int getYear() {
        return this.year;
    }

    public abstract String toString();
    public abstract void play();
}
