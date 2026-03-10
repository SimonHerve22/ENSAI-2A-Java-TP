package fr.ensai.library;

public class Main {

        public static void main(String[] args) {

                Author tolkien = new Author("J.R.R. Tolkien", 81, "UK");

                Book fellowshipOfTheRing = new Book(
                                "978-0-618-26025-6",
                                "The Fellowship of the Ring",
                                tolkien,
                                1954,
                                423);

                System.out.println(fellowshipOfTheRing.toString());
                Library lib = new Library("agora");
                lib.loadBooksFromCSV("books.csv");
                

                Magazine m1 = new Magazine("1234", "Wapiti", 54, 2025, 50);
                Magazine m2 = new Magazine("1234", "Wapitiii", 55, 2024, 51);
                lib.addItem(m1);
                lib.addItem(m2);
                System.out.println(lib.display());
        }
}