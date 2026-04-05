class UserManagerRunner {
    public static void main(String[] args) {

        UserManager u1 = new UserManager();

        System.out.println("------------------");

        UserManager u2 = new UserManager("Sneha",102);

        System.out.println("------------------");

        UserManager u3 = new UserManager("kushal", 103, "User");

        System.out.println("------------------");

        UserManager u4 = new UserManager("sowmya", 104, "Manager", "Sowmyaa@gmail.com");

        System.out.println("------------------");

        UserManager u5 = new UserManager("sujatha", 505, "Developer", "sujatha@gmail.com", "banglore");
    }
}