package Ex10;

public class Main {

    public static void main(String[] args) {
        Author author = new Author("Salah","Salah@test.com", 'm');
        Author author2 = new Author("Khalid","Khalid@test.com", 'm');
        Author author3 = new Author("Omar","Omar@test.com", 'm');
        Author[] arr = {author,author2,author3};
        Book book = new Book("Math", arr,32);
        System.out.println(book);
        System.out.println("getAuthorsName(): " + book.getAuthorsName());
    }
}
