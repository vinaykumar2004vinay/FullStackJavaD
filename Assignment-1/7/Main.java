class Book
{
    int id;
    String title;
    String author;
    double price;

    Book(int id, String title, String author, double price)
    {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Book[] books = new Book[5];

        books[0] = new Book(1, "Java", "Ram", 900);
        books[1] = new Book(2, "Python", "Amith", 550);
        books[2] = new Book(3, "Hindi", "Rahul", 600);
        books[3] = new Book(4, "Social", "Modi", 699);
        books[4] = new Book(5, "Maths", "Sonia", 750);

        System.out.println("All Book Titles:");
        for (Book b : books)
            {
                System.out.println(b.title);
            }

        System.out.println("--------------------------------------------");

        System.out.println("Books priced above 500");
        for (Book b : books)
        {
            if (b.price > 500)
                {
                    System.out.println(b.title + " - " + b.price);
                }
        }
    }
}