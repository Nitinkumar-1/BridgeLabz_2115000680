public class Product {
    private static double discount = 10.0; 
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID; 
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void printProductDetails(Object obj) {
        if (obj instanceof Product) {
            Product product = (Product) obj;
            double discountedPrice = product.price * (1 - discount / 100);
            System.out.println("Product ID: " + product.productID);
            System.out.println("Product Name: " + product.productName);
            System.out.println("Price: $" + product.price);
            System.out.println("Quantity: " + product.quantity);
            System.out.println("Discounted Price: $" + discountedPrice);
        } else {
            System.out.println("The provided object is not an instance of Product.");
        }
    }
    public static void displayCurrentDiscount() {
        System.out.println("Current Discount: " + discount + "%");
    }
    public static void main(String[] args) {
        Product prod1 = new Product(101, "Laptop", 1000.00, 2);
        Product prod2 = new Product(102, "Headphones", 150.00, 5);
        Product.displayCurrentDiscount();
        prod1.printProductDetails(prod1); 
        prod2.printProductDetails(prod2); 
        Product.updateDiscount(20.0);
        System.out.println("\nUpdated Discount:\n");
        Product.displayCurrentDiscount();
        prod1.printProductDetails(prod1); 
        prod2.printProductDetails(prod2); 
    }
}
