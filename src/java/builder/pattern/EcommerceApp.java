package builder.pattern;

public class EcommerceApp {
    public static void main(String[] args) {
        Product product = new Product.Builder("T-Shirt", 499.0)
                .description("100% Cotton, Unisex")
                .discount(10)
                .imageUrl("http://example.com/tshirt.jpg")
                .build();
        product.display();
    }
}

