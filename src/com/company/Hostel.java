package com.company;

public class Hostel extends Family implements Rent{
    public Hostel(int quantity, String address) {
        super(quantity, address);
    }

    @Override
    public void rent() {
        System.out.println("We pay rent for hostel in "+getAddress());
    }

    public void getInfo(){
        System.out.println("address is: "+getAddress()+", family members: "+getQuantity());
    }
}
