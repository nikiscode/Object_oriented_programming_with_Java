import java.util.Scanner;

class Product {
    private String productId;
    private String productName;
    private double price;
    private String category;

    // Constructor 1: Only ID and Name (Uses defaults for others)
    public Product(String id, String name) {
        this.productId = id;
        this.productName = name;
        this.price = 0.0;
        this.category = "General";
    }

    // Constructor 2: ID, Name, and Price
    public Product(String id, String name, double price) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.category = "General";
    }

    // Constructor 3: Complete Details
    public Product(String id, String name, double price, String category) {
        this.productId = id;
        this.productName = name;
        this.price = price;
        this.category = category;
    }

    public void displayProduct() {
        System.out.println("\n--- Product Record Summary ---");
        System.out.println("ID       : " + productId);
        System.out.println("Name     : " + productName);
        System.out.println("Price    : $" + price);
        System.out.println("Category : " + category);
        System.out.println("------------------------------");
    }
}

public class productMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Welcome to Inventory Manager ===");

        // Quick Entry (ID and Name only)
        System.out.println("\n[Entry 1: Quick Entry]");
        System.out.print("Enter Product ID: ");
        String id1 = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name1 = sc.nextLine();
        Product p1 = new Product(id1, name1);

        // Entry with Price
        System.out.println("\n[Entry 2: Entry with Price]");
        System.out.print("Enter Product ID: ");
        String id2 = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name2 = sc.nextLine();
        System.out.print("Enter Price: ");
        double price2 = sc.nextDouble();
        sc.nextLine(); // Clear buffer after nextDouble()
        Product p2 = new Product(id2, name2, price2);

        // Full Detailed Entry
        System.out.println("\n[Entry 3: Full Detailed Entry]");
        System.out.print("Enter Product ID: ");
        String id3 = sc.nextLine();
        System.out.print("Enter Product Name: ");
        String name3 = sc.nextLine();
        System.out.print("Enter Price: ");
        double price3 = sc.nextDouble();
        sc.nextLine(); // Clear buffer
        System.out.print("Enter Category: ");
        String cat3 = sc.nextLine();
        Product p3 = new Product(id3, name3, price3, cat3);

        p1.displayProduct();
        p2.displayProduct();
        p3.displayProduct();

        sc.close();
    }
}
