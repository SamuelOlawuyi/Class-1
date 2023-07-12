package org.example.Entities;

public class Product implements Comparable<Product>{
    private int unit;
    private String description;
    private double unitPrice;
    private double amount;

//    public Product(int Unit, String description, double unitPrice, double amount){
//        this.unit = unit;
//        this.description = description;
//        this.unitPrice = unitPrice;
//        this.amount = amount;
//    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
//        return "Product{" +
//                "unit=" + unit +
//                ", description='" + description + '\'' +
//                ", unitPrice=" + unitPrice +
//                ", amount=" + amount +
//                '}';
        return "Unit: " + unit + "\n  description: " + description + "\n  unitprice: " + unitPrice + " \n amount: " + amount + "\n\n";
    }

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.unit,o.unit);
    }
}
