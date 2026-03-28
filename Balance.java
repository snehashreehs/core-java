class Balance {

    public static void main(String[] args) {

        String accountHolder;
        long accountNumber;
        double amount;
        String bankName;
        boolean isActive;

        accountHolder = "Sneha";
        accountNumber = 12345678901L;
        amount = 25000.50;
        bankName = "SBI";
        isActive = true;
		
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Is Active: " + isActive);

        accountHolder = "Pavithra";
        accountNumber = 98765432109L;
        amount = 50000.75;
        bankName = "HDFC";
        isActive = false;
		
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Amount: " + amount);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Is Active: " + isActive);
    }
}