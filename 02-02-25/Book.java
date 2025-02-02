public class Book{
    private String title;
    private String author;
    private double price;
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.displayBookInfo();
        System.out.println();
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        book2.displayBookInfo();
        System.out.println();
        try {
            Book book3 = new Book("1984", "George Orwell", -5.99);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
