package Ex6;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(1,"Salah", 15);
        System.out.println("toString(): "+customer);

        Invoice invoice = new Invoice(001, customer, 200);
        System.out.println("toString(): "+ invoice);
        invoice.getAmountAfterDiscount();
        System.out.println("toString(): "+ invoice);

    }
}
