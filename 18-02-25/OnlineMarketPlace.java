abstract class Category {
    private String name;
    public Category(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
class BookCategory extends Category {
    public BookCategory() {
        super("Books");
    }
}
class ClothingCategory extends Category {
    public ClothingCategory() {
        super("Clothing");
    }
}
class GadgetCategory extends Category {
    public GadgetCategory() {
        super("Gadgets");
    }
}
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public T getCategory() {
        return category;
    }
   @Override
    public String toString() {
        return "Product: " + name + ", Price: $" + price + ", Category: " + category.getName();
    }
}
class ProductCatalog {
    private Product<?>[] products;
    private int count;

    @SuppressWarnings("unchecked")
    public ProductCatalog(int capacity) {
        products = (Product<?>[]) new Product<?>[capacity];
        count = 0;
    }
    public <T extends Category> void addProduct(Product<T> product) {
        if (count < products.length) {
            products[count++] = product;
        } else {
            System.out.println("Catalog is full. Cannot add product: " + product.getName());
        }
    }
    public void displayCatalog() {
        for (int i = 0; i < count; i++) {
            System.out.println(products[i]);
        }
    }
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() - (product.getPrice() * percentage / 100);
        product.setPrice(discountedPrice);
        System.out.println("Discount applied to " + product.getName() + ". New price: $" + discountedPrice);
    }
}
public class OnlineMarketplace {
    public static void main(String[] args) {
        ProductCatalog catalog = new ProductCatalog(5);
        BookCategory bookCategory = new BookCategory();
        ClothingCategory clothingCategory = new ClothingCategory();
        GadgetCategory gadgetCategory = new GadgetCategory();
        Product<BookCategory> book1 = new Product<>("The Great Gatsby", 15.99, bookCategory);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 25.00, clothingCategory);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 699.99, gadgetCategory);
        catalog.addProduct(book1);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        System.out.println("Product Catalog:");
        catalog.displayCatalog();
        System.out.println("\nApplying discount:");
        ProductCatalog.applyDiscount(phone, 15); 
        System.out.println("\nUpdated Product Catalog:");
        catalog.displayCatalog();
    }
}
