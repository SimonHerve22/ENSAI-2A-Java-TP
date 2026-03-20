package fr.ensai.mediaplayer;

public class Artist {
    private String firstName;
    private String lastName;
    private String nationality;

    /**
     * Constructs a new Artist object.
     *
     * @param firstName      The first name of the artist.
     * @param lastName       The last name of the artist.
     * @param nationality    The nationality of the artist.
     */
    public Artist(String firstName, String lastName, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationality = nationality;
    }

    /**
     * String representation of the Artist.
     */
    @Override
    public String toString() {
        return String.format("Artist %s %s ", this.firstName, this.lastName);
    }

    /**
     * Returns the first name of the Artist.
     */
    public String getfirstName() {
        return this.firstName;
    }

    /**
     * Returns the last name of the Artist.
     */
    public String getlastName() {
        return this.lastName;
    }
}
