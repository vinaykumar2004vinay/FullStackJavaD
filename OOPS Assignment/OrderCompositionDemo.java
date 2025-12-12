// OrderCompositionDemo.java
public class OrderCompositionDemo {
    public static void main(String[] args) {
        Customer cust = new Customer(101, "Priya");
        Order order = new Order(5001, cust);
        order.printOrderDetails();
    }
}

class Customer {
    private int id;
    private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }
    public int getId() { return id; }
}

class Order {
    private int orderId;
    private Customer customer; // composition

    public Order(int orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
    }

    public void printOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}