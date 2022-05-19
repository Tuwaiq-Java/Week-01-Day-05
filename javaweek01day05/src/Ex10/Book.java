package Ex10;

public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty=0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorsName() {
        String ath = "[";
        for(Author author: this.authors) {
            ath += author.getName() + " ";
        }
        ath += "]";
        return ath;
    }


    public String toString() {
        String str = String.format("Book[name=%s,authors=",name);
        for(Author author: authors) {
            str += author + ",";
        }
        str+=String.format(",price=%.0f,qty=%d]",price,qty);
        return str;
    }
}
