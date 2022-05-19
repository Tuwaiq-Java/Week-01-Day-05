package Ex7;

import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense, productExpense;

    public Visit(Customer customer, Date date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return this.customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense += ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense += ex;
    }

    public double getTotalExpense() {
        return this.productExpense + this.serviceExpense;
    }

    public String toString() {
        return String.format("Visit[%s], total expense= %.2f]" ,customer,getTotalExpense() );
    }
}
