package Ex7;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Salah");
        customer.setMember(true);
        customer.setMemberType("Gold");
        System.out.println("customer toString(): " + customer);

        Visit visit = new Visit(customer, new Date(2022,5,15));
        visit.setProductExpense(40);
        visit.setServiceExpense(33);
        System.out.println("visit toString(): " + visit);
        visit.setServiceExpense(100 * DiscountRate.getServiceDiscountRate("Gold"));
        System.out.println("visit toString(): " + visit);
    }
}
