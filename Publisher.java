public class Publisher {

    public static void main(String[] args) {

        // 3 arrays with 10 values
        String[] publisherNames = {
            "Penguin", "HarperCollins", "Macmillan", "SimonSchuster", "Hachette",
            "Oxford", "Cambridge", "Pearson", "Springer", "Wiley"
        };

        String[] cities = {
            "New York", "London", "Delhi", "Paris", "Berlin",
            "Tokyo", "Sydney", "Toronto", "Dubai", "Singapore"
        };

        int[] establishedYear = {
            1935, 1817, 1843, 1924, 1826,
            1586, 1534, 1844, 1842, 1807
        };

        // Printing using index loop
        System.out.println("Printing using Index Loop:");
        for (int i = 0; i < publisherNames.length; i++) {
            System.out.println("Publisher: " + publisherNames[i] +
                               ", City: " + cities[i] +
                               ", Year: " + establishedYear[i]);
        }

        // Printing using for-each loop
        System.out.println("\nPublishing Names (For-Each Loop):");
        for (String name : publisherNames) {
            System.out.println(name);
        }

        System.out.println("\nCities (For-Each Loop):");
        for (String city : cities) {
            System.out.println(city);
        }

        System.out.println("\nEstablished Years (For-Each Loop):");
        for (int year : establishedYear) {
            System.out.println(year);
        }
    }
}