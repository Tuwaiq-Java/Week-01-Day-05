package Ex6;

import Ex6.Customer;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.customer.getId();
    }

    public String getCustomerName() {
        return this.customer.getName();
    }

    public int getCustomerDiscount(){
        return this.customer.getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount -= this.amount * this.customer.getDiscount() / 100;
    }

    public String toString() {
        return String.format("Invoice[id=%d,%s,amount=%.2f]", getId(),customer.toString(),getAmount());
    }


}
