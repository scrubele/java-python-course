package com.scrubele;

import java.util.Objects;

public class BeatyProduct {
    private int id;
    private String name;
    private Double price;
    private ProductType type;
    private int quantity;

    public BeatyProduct() {
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id=id;
    }

    public final void setName(String newName) {
        this.name = newName;
    }

    public final void setPrice(Double newPrice) {
        this.price = newPrice;
    }

    public final void setType(ProductType newType) {
        this.type = newType;
    }

    public final void setQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public BeatyProduct(String newName, Double newPrice, ProductType newType, int newQuantity) {
        setName(newName);
        setPrice(newPrice);
        setType(newType);
        setQuantity(newQuantity);
    }

    @Override
    public String toString() {
        return type + " {" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    public final String getName() {
        return name;
    }

    public final Double getPrice() {
        return price;
    }

    public final ProductType getType() {
        return type;
    }

    public final int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeatyProduct that = (BeatyProduct) o;
        return quantity == that.quantity &&
                Objects.equals(name, that.name) &&
                Objects.equals(price, that.price) &&
                type == that.type;
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, price, type, quantity);
    }

    public String getHeaders() {
        return "name,price,type,quantity";
    }
    private static final String COMMA_DELIMITER = ",";

    public String toCSV() {
        StringBuilder string = new StringBuilder();
        string.append(this.getName());
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getPrice()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getType().toString()));
        string.append(COMMA_DELIMITER);
        string.append(String.valueOf(this.getQuantity()));


        return string.toString();
    }
}
