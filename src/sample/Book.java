package sample;

public class Book {
    // properties
    private Double Price;
    private String Title;
    private String Author;

    public Book(String title) {
        Title = title;
    }

    public Book(String title, Double price) {
        Title = title;
        Price = price;
    }

    public void setPrice(Double p) {
        Price = p;
    }

    public void setTitle(String t) {
        Title = t;
    }

    public void setAuthor(String a) {
        Author = a;
    }

    public Double getPrice() {
        return Price;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }
}
