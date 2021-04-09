package dpdev.product;

public class Product {
    private String name;
    private double regularPrice;
    private double discount;

    public Product(String name) {
        this.name = name;
    }

    public double actualPrice() {
        return this.regularPrice - (this.regularPrice * this.discount) / 100;
    }

    public void printInformation() {
        System.out.printf("Product : name = %s, regular price = %.2f EUR, discount = %.1f%%, actual price = %.2f  EUR.",
                this.name, this.regularPrice, this.discount, this.actualPrice());
    }

    public String getName() {
        return name;
    }

    public double getRegularPrice() {

        return regularPrice;

    }

    public void setRegularPrice(double regularPrice) {
        if (regularPrice >= 0)
            this.regularPrice = regularPrice;
        else throw new IllegalArgumentException("Wrong argument!");
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        if (discount >= 0)
            this.discount = discount;
        else throw new IllegalArgumentException("Wrong argument!");
    }


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", regularPrice=" + regularPrice +
                ", discount=" + discount +
                '}';
    }
}
