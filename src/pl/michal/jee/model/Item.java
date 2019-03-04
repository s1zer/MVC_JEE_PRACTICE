package pl.michal.jee.model;

public class Item {
    private String product;
    private double originalPrice;
    private double adidasDiscountPrice;
    private double amountDiscountPrice;
    private double discountPrice;

    public Item(String product, double originalPrice) {
        setProduct(product);
        setOriginalPrice(originalPrice);
    }

    public double getAdidasDiscountPrice() {
        return adidasDiscountPrice;
    }

    public void setAdidasDiscountPrice(double adidasDiscountPrice) {
        this.adidasDiscountPrice = adidasDiscountPrice;
    }

    public double getAmountDiscountPrice() {
        return amountDiscountPrice;
    }

    public void setAmountDiscountPrice(double amountDiscountPrice) {
        this.amountDiscountPrice = amountDiscountPrice;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(double discountPrice) {
        this.discountPrice = discountPrice;
    }
}
