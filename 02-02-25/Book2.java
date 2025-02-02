public class Book2 {
    private String title;
    private String author;
    private double price;
    private boolean available;
    public Book2() {
        this.title = "Unknown";
        this.author = "Unknown";
        this.price = 0.0;
        this.available = true;
    }
    public Book2(String title, String author, double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
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
        this.price = price;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed successfully.");
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }
    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + (available ? "Yes" : "No"));
    }
    public static void main(String[] args) {
        Book2 Book2 = new Book2("1984", "George Orwell", 15.99, true);
        Book2.displayBookInfo();
        Book2.borrowBook();
        Book2.displayBookInfo();
    }
}
