class Magazine {
    public static void main(String[] args) {

        String magazineName;
        String editorName;
        int issueNumber;
        double price;
        String publicationMonth;
		
        magazineName = "Tech World";
        editorName = "Anita Sharma";
        issueNumber = 12;
        price = 120.50;
        publicationMonth = "January";

        System.out.println("Magazine Name: " + magazineName);
        System.out.println("Editor Name: " + editorName);
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Price: " + price);
        System.out.println("Publication Month: " + publicationMonth);

        magazineName = "Science Today";
        publicationMonth = "February";

        System.out.println("Magazine Name: " + magazineName);
        System.out.println("Publication Month: " + publicationMonth);
    }
}