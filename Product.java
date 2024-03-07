package compinedAssign;

public class Product {

    private String name;
    private int id;
    private double price;
    private boolean available;

    public Product(String name, int id, double price, boolean available) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.available = available;
    }

    public void printProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Product ID: " + id);
        System.out.println("Product Price: " + price);
        System.out.println("Product Availability: " + available);
    }

    public static void main(String[] args) {
        
        Product product1=new Product("Smartphone", 101, 599.99, true);

        product1.printProductDetails();
    }
}
