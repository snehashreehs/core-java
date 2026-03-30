public class Author {

    public static void main(String[] args) {

        // Declare 3 arrays with 10 values each
        String[] books = {
            "Book1","Book2","Book3","Book4","Book5",
            "Book6","Book7","Book8","Book9","Book10"
        };

        String[] authors = {
            "Author1","Author2","Author3","Author4","Author5",
            "Author6","Author7","Author8","Author9","Author10"
        };

        int[] years = {
            2001,2002,2003,2004,2005,
            2006,2007,2008,2009,2010
        };

        // Print using index loop
        System.out.println("Printing using Index Loop:");

        for (int i = 0; i < books.length; i++) {
            System.out.println("Book: " + books[i] + 
                               ", Author: " + authors[i] + 
                               ", Year: " + years[i]);
        }

        // Print using for-each loop
        System.out.println("\nPrinting Books using For-Each Loop:");
        for (String book : books) {
            System.out.println(book);
        }

        System.out.println("\nPrinting Authors using For-Each Loop:");
        for (String author : authors) {
            System.out.println(author);
        }

        System.out.println("\nPrinting Years using For-Each Loop:");
        for (int year : years) {
            System.out.println(year);
        }
    }
}