class Product
{
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void Discount(int percentage)
    {
        double discountAmount = (this.price * percentage) / 100;
        this.price = this.price - discountAmount;
        
        System.out.println("Applied " + percentage + " discount to " + this.name);
    }

    public void displayProduct()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name );
        System.out.println("Current Price: " + price );
        System.out.println("--------------------------------------------------");
    }
}