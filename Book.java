class Book {

    int getPrice() {
        int price = 500;
        System.out.println("Price is: " + price);
        return price;
    }

    void displayAuthor(String author) {
        System.out.println("Author is: " + author);
        int p = getPrice();
        System.out.println("Returned Price: " + p);
    }

    void showDetails() {
        System.out.println("Book details");
        displayAuthor("R.K. Narayan");
    }
}


