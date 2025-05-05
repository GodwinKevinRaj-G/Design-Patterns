package prototype_designpattern;

public class Product implements PrototypeProduct {
    private final String name;
    private final String category;
    private double price;
    private String color;
    public Product(String name, String category, double price, String color) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public Product clone() {
        return new Product(name, category, price, color);
    }

    public void display() {
        System.out.println(
                "Name: " + name + ", " +
                "Category: " + category + "," +
                " Price: " + price + "," +
                " Color: " + color
        );
    }

}
