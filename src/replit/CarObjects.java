package replit;

public class  CarObjects {
        // Instance variables
        private String model;
        private double price;
        private int quantity;

        // Constructor to initialize instance variables
        public  CarObjects(String model, double price, int quantity) {
            this.model = model;
            this.price = price;
            this.quantity = quantity;
        }

        // Method to calculate and print the total value of cars in stock
        void CarStockValue() {
            double stockValue = price * quantity;
            System.out.println(model + " 2019 Stock Value " + stockValue);
        }
    public static void main(String[] args) {
       CarObjects toyota = new CarObjects("Toyota", 25000.0,1000);
       CarObjects bmw = new CarObjects("BMW", 652980.0,100);

        // Calculate and print the stock value of each car
       toyota.CarStockValue();
      bmw.CarStockValue();

    }
}



