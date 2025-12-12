// ProductDemo.java
public class ProductDemo {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Wireless Mouse", 799.0);
        Product p2 = new Product(102, "Mechanical Keyboard", 2499.0);

        p1.applyDiscount(10); // 10% discount
        p2.applyDiscount(25); // 25% discount

        p1.display();
        p2.display();
    }
}

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void applyDiscount(double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage.");
            return;
        }
        price = price - (price * percentage / 100.0);
    }

    public void display() {
        System.out.printf("Product[id=%d, name=%s, price=%.2f]%n", id, name, price);
    }
}