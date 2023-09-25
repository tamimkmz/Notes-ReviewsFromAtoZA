package Class11OfHW;


public class StoreProduct {
    private String label;
    private double price;
    private String category;
    private boolean hasExpiration;
    private int stock;

    // Main constructor with all parameters
    public StoreProduct(String label, double price, String category, boolean hasExpiration, int stock) {
        this.label = label;
        this.price = price;
        this.category = category;
        this.hasExpiration = hasExpiration;
        this.stock = stock;
    }

    // Second constructor with all parameters except category and hasExpiration
    public StoreProduct(String label, double price, int stock) {
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = stock; // Defaults category to "misc" and hasExpiration to false
    }

    // Third constructor with all parameters except category, expiration, and stock
    public StoreProduct(String label, double price) {
        this.label = label;
        this.price = price;
        this.category = "misc";
        this.hasExpiration = false;
        this.stock = 0; // Defaults category to "misc", hasExpiration to false, and stock to 0
    }

    // Method to display class variable values in one line
    public void display() {
        System.out.println("Label: " + label + ", Price: $" + price + ", Category: " + category +
                ", Has Expiration: " + hasExpiration + ", Stock: " + stock);
    }


    public static void main(String[] args) {
        // Create StoreProduct objects using different constructors
        StoreProduct product1 = new StoreProduct("Egge", 3.0,"produce", true, 10);
        StoreProduct product2 = new StoreProduct("Paper Towel", 2.0,"misc",false, 24);
        StoreProduct product3 = new StoreProduct("Paper Towel", 2.0,null,false,0);

        // Display product information

        product1.display();
        product2.display();
        product3.display();
    }
}