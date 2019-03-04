package pl.michal.jee.service;

import pl.michal.jee.model.Item;

import java.util.List;

public class PaymentService {
    private static final String DISCOUNT_BRAND = "adidas";
    private static final double PRICE_TO_DISCOUNT = 500;

    public static void applyDiscount(List<Item> items) {
        discountAmount(items);
        discountForAdidas(items);
    }

    private static void discountForAdidas(List<Item> items) {
        items.stream()
                .filter(item -> item.getProduct().toLowerCase().contains(DISCOUNT_BRAND))
                .forEach(PaymentService::discountForItemAdidas);
    }

    private static void discountForItemAdidas(Item item) {
        double priceToDiscount;
        if (item.getDiscountPrice() != 0) {

            priceToDiscount = item.getDiscountPrice();
        } else {
            priceToDiscount = item.getOriginalPrice();
        }

        item.setDiscountPrice(priceToDiscount * 0.9);
    }

    private static void discountAmount(List<Item> items) {
        if (totalPrice(items) > PRICE_TO_DISCOUNT) {
            items.forEach(item -> item.setDiscountPrice(item.getOriginalPrice() * 0.8));
        } else {
            items.forEach(item -> item.setDiscountPrice(item.getOriginalPrice()));
        }
    }

    public static double totalPrice(List<Item> items) {
        return items.stream()
                .mapToDouble(Item::getOriginalPrice)
                .sum();
    }

    public static double totalPriceAfterDiscount(List<Item> items) {
        return items.stream()
                .mapToDouble(Item::getDiscountPrice)
                .sum();
    }
}
