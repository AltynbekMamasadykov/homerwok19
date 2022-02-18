package com.company;

public abstract class Family {
    private int quantity;
    private String address;

    public Family(int quantity, String address) {
        this.quantity = quantity;
        this.address = address;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
