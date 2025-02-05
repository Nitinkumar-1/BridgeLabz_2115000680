import java.util.ArrayList;

class ECommercePlatform {
    private String name;
    private ArrayList<Customer> customers;
    
    public ECommercePlatform(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }
    
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void displayPlatformInfo() {
        System.out.println("E-Commerce Platform: " + name);
        for (Customer customer : customers) {
            customer.displayOrders();
        }
    }
}

class Customer {
    private String name;
    private ArrayList<Order> orders;
    
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }
    
    public void placeOrder(Order order) {
        orders.add(order);
    }
    
    public void displayOrders() {
        System.out.println("Customer: " + name);
        for (Order order : orders) {
            order.displayProducts();
        }
    }
}

class Order {
    private int orderId;
    private ArrayList<Product> products;
    
    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }
    
    public void addProduct(Product product) {
        products.add(product);
    }
    
    public void displayProducts() {
        System.out.println("Order ID: " + orderId);
        for (Product product : products) {
            System.out.println("Product: " + product.getName());
        }
    }
}

class Product {
    private String name;
    
    public Product(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        ECommercePlatform platform = new ECommercePlatform("ShopEase");
        
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");
        
        Order order1 = new Order(101);
        Order order2 = new Order(102);
        
        Product product1 = new Product("Laptop");
        Product product2 = new Product("Phone");
        Product product3 = new Product("Headphones");
        
        order1.addProduct(product1);
        order1.addProduct(product2);
        order2.addProduct(product3);
        
        customer1.placeOrder(order1);
        customer2.placeOrder(order2);
        
        platform.addCustomer(customer1);
        platform.addCustomer(customer2);
        
        platform.displayPlatformInfo();
    }
}
