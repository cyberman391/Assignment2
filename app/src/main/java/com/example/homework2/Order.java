package com.example.homework2;

public class Order {

    private int orderID;
    private String orderitem;
    private int imageDrawableId;
    private String price;
    private double orderPrice;
    private String description;

    public Order(int orderID, String orderitem, int imageDrawableId, String price, double orderPrice, String description) {
        this.imageDrawableId = imageDrawableId;
        this.orderID = orderID;
        this.orderitem = orderitem;
        this.price = price;
        this.orderPrice = orderPrice;
        this.description = description;
    }



    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public int getImageDrawableId() {
        return imageDrawableId;
    }

    public void setImageDrawableId(int imageDrawableId) {
        this.imageDrawableId = imageDrawableId;
    }

    public String getOrderitem() {
        return orderitem;
   }

    public void setOrderitem(String orderitem) {
        this.orderitem = orderitem;
    }

    public double getOrderPrice() { return orderPrice; }

    public void setOrderPrice(double orderPrice) { this.orderPrice = orderPrice; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}
