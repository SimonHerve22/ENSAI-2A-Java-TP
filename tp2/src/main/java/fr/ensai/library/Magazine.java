package fr.ensai.library;

/**
 * Represents a magazine.
 */
public class Magazine extends Item {

    // Attributes
    private String issn;
    private String title;
    private int issueNumber;
    private int year;
    private int pageCount;

    /**
     * Constructs a new Magazine object.
     */
    public Magazine(String issn, String title, int issueNumber, int year, int pageCount) {
        super(title, year, pageCount);
        this.issn = issn;
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return String.format("Magazine %s n° %d", this.title, this.issueNumber);
    }

}
