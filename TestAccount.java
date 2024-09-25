public class TestAccount {
    public static void main(String[] args) {
        Account acc1 = new Account("A1", "Brandy", 5000);
        Account acc2 = new Account("A2", "Billy Mays", 4000);

        System.out.println("Balance of Account 1: $" + acc1.getBalance());
        System.out.println("Balance of Account 2: $" + acc2.getBalance());
        

        acc1.transferTo(acc2, 1000);

        System.out.println("Updated balance of Account 1: $" + acc1.getBalance());
        System.out.println("Updated balance of Account 2: $" + acc2.getBalance());
       
    
}
}
