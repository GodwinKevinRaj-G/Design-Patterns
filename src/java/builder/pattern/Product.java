package builder.pattern;

public class Product {
    private final String name;
    private final double price;
    private final String description;
    private final double discount;
    private final String imageUrl;

    private Product(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.discount = builder.discount;
        this.imageUrl = builder.imageUrl;
    }

    public static class Builder {
        private final String name;
        private final double price;

        private String description;
        private double discount;
        private String imageUrl;

        public Builder(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public Builder description(String desc) {
            this.description = desc;
            return this;
        }

        public Builder discount(double discount) {
            this.discount = discount;
            return this;
        }

        public Builder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }

    public void display() {
        System.out.println("Product: " + name + ", Price: ₹" + price +
                ", Desc: " + description + ", Discount: " + discount + "%, Image: " + imageUrl);
    }
}

