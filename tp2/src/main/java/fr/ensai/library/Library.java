package fr.ensai.library;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Represents a Library
 */
public class Library {
    // -------------------------------------------------------
    // Attributes
    // -------------------------------------------------------
    private String name;
    private List<Book> books;

    /**
     * Constructs a new Library
     * @param name Nom de la librairie
     * @param books Liste des livres de la librairie
     */
    public Library(String nom, List<Book> book) {
        this.name = nom;
        this.books = book;
    }


    // -------------------------------------------------------
    // Methods
    // -------------------------------------------------------

    /**
     * Print le nom de la librairie
     */
    public void printname() {
        System.out.println(this.name);
    }
    
    /**
     * Ajouter un livre à la liste de livres
     */
    public void addBook(Book livre) {
        this.books.add(livre);
    }
    
    /**
     * Affiche tous les livres
     *
     * @return true if attribute2 is odd, false otherwise.
     */
    public void isAttribute2Odd() {
        Boolean trouve = false;
        for (int i = 0; i < this.books.size(); i++) {
            trouve = true;
            Book livre = this.books.get(i);
            livre.toString();
        }
        if (!trouve){
            System.out.println("Il n'y a pas de livres");
        }
    }


    /**
     * Main method
     */
    public static void main(String[] args) {
    }

    /**
     * Loads books from a CSV file and adds them to the library.
     * 
     * @param filePath The path to the CSV file containing book data.
     * @throws IOException If there is an error reading the file, an
     *                     {@link IOException} will be thrown.
     */
    public void loadBooksFromCSV(String filePath) {

        URL url = getClass().getClassLoader().getResource(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(url.getFile()))) {
            Map<String, Author> authors = new HashMap<>();
            String line;
            br.readLine(); // Skip the header line

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length == 5) {
                    String isbn = data[0].trim();
                    String title = data[1].trim();
                    String authorName = data[2].trim();
                    int year = Integer.parseInt(data[3].trim());
                    int pageCount = Integer.parseInt(data[4].trim());

                    // Check if author already exists in the map
                    Author author = authors.get(authorName);
                    if (author == null) {
                        author = new Author(authorName);
                        authors.put(authorName, author);
                        //System.out.println(String.format("Create %s", author));
                    }
                    Book book = new Book(isbn, title, author, year, pageCount);

                    this.addBook(book);
                }
            }
        } catch (

        IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
