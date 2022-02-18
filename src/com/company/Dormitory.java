package com.company;

public class Dormitory extends Family implements Rent{
    public Dormitory(int quantity, String address) {
        super(quantity, address);
    }

    @Override
    public void rent() {
        System.out.println("We pay rent for dormitory in "+getAddress());
    }

    public void getInfo(){
        System.out.println("address is: "+getAddress()+", family members: "+getQuantity());
    }
}
