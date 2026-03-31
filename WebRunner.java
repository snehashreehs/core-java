class WebRunner {

    public static void main(String[] args) {

        Web w1 = new Web();

        w1.websiteName = "Google";
        w1.domain = "www.google.com";
        w1.owner = "Google LLC";
        w1.visitors = 1000000;
        w1.rating = 4.8;
        w1.isLive = true;
        w1.category = "Search Engine";

        Web w2 = new Web();

        w2.websiteName = "YouTube";
        w2.domain = "www.youtube.com";
        w2.owner = "Google LLC";
        w2.visitors = 800000;
        w2.rating = 4.7;
        w2.isLive = true;
        w2.category = "Video";

        Web w3 = new Web();

        w3.websiteName = "Amazon";
        w3.domain = "www.amazon.in";
        w3.owner = "Amazon Inc";
        w3.visitors = 600000;
        w3.rating = 4.5;
        w3.isLive = true;
        w3.category = "E-commerce";

        Web w4 = new Web();

        w4.websiteName = "Flipkart";
        w4.domain = "www.flipkart.com";
        w4.owner = "Flipkart Pvt Ltd";
        w4.visitors = 500000;
        w4.rating = 4.3;
        w4.isLive = false;
        w4.category = "Shopping";

        System.out.println("***** Printing Web Details *****");

        System.out.println("w1 Name: " + w1.websiteName);
        System.out.println("w1 Domain: " + w1.domain);
        System.out.println("w1 Owner: " + w1.owner);
        System.out.println("w1 Visitors: " + w1.visitors);
        System.out.println("w1 Rating: " + w1.rating);
        System.out.println("w1 Live: " + w1.isLive);
        System.out.println("w1 Category: " + w1.category);

        System.out.println("***** Printing Web Details *****");

        System.out.println("w2 Name: " + w2.websiteName);
        System.out.println("w2 Domain: " + w2.domain);
        System.out.println("w2 Owner: " + w2.owner);
        System.out.println("w2 Visitors: " + w2.visitors);
        System.out.println("w2 Rating: " + w2.rating);
        System.out.println("w2 Live: " + w2.isLive);
        System.out.println("w2 Category: " + w2.category);

        System.out.println("***** Printing Web Details *****");

        System.out.println("w3 Name: " + w3.websiteName);
        System.out.println("w3 Domain: " + w3.domain);
        System.out.println("w3 Owner: " + w3.owner);
        System.out.println("w3 Visitors: " + w3.visitors);
        System.out.println("w3 Rating: " + w3.rating);
        System.out.println("w3 Live: " + w3.isLive);
        System.out.println("w3 Category: " + w3.category);

        System.out.println("***** Printing Web Details *****");

        System.out.println("w4 Name: " + w4.websiteName);
        System.out.println("w4 Domain: " + w4.domain);
        System.out.println("w4 Owner: " + w4.owner);
        System.out.println("w4 Visitors: " + w4.visitors);
        System.out.println("w4 Rating: " + w4.rating);
        System.out.println("w4 Live: " + w4.isLive);
        System.out.println("w4 Category: " + w4.category);
    }
}