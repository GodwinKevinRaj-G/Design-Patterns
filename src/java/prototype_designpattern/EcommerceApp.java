package prototype_designpattern;

public class EcommerceApp {
    public static void main(String[] args) {
        Product blacktShirt = new Product("Plain T-shirt", "Clothing", 499.0, "Black");

        Product redTShirt = blacktShirt.clone();
        redTShirt.setColor("Red");

        Product blueTshirt = blacktShirt.clone();
        blueTshirt.setColor("Blue");
        blueTshirt.setPrice(549.0);

        blacktShirt.display();
        redTShirt.display();
        blueTshirt.display();
    }
}
