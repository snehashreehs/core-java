class SystemInfo {

    public static void main(String[] args) {

        String systemName;
        String version;
        int memoryGB;
        String processor;
        boolean isUpdated;

        systemName = "Windows";
        version = "11";
        memoryGB = 16;
        processor = "Intel i5";
        isUpdated = true;

        System.out.println("System Name: " + systemName);
        System.out.println("Version: " + version);
        System.out.println("Memory (GB): " + memoryGB);
        System.out.println("Processor: " + processor);
        System.out.println("Is Updated: " + isUpdated);

        systemName = "Linux";
        version = "Ubuntu 22.04";
        memoryGB = 8;
        processor = "AMD Ryzen 5";
        isUpdated = false;

        System.out.println("System Name: " + systemName);
        System.out.println("Version: " + version);
        System.out.println("Memory (GB): " + memoryGB);
        System.out.println("Processor: " + processor);
        System.out.println("Is Updated: " + isUpdated);
    }
}