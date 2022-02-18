package com.company;

public class Flat extends Family implements Utilities{


    public Flat(int quantity, String address) {
        super(quantity, address);
    }


    @Override
    public void utilities() {
        System.out.println("We pay utilities for flat in "+getAddress());
    }

    public void getInfo(){
        System.out.println("address is: "+getAddress()+", family members:"+getQuantity());
    }
}
