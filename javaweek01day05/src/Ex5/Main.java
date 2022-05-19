package Ex5;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"Salah", 'M');
        Account a1 = new Account(001, c1, 1000);

        System.out.println(a1);
        a1.setBalance(2000);
        System.out.println("setBalance(2000): " + a1);
        a1.withdraw(300);
        System.out.println("withdraw(300): " + a1);
        a1.deposit(333);
        System.out.println("deposit(333): " + a1);
        a1.withdraw(3000);
        System.out.println("withdraw(3000): " + a1);
    }
}
