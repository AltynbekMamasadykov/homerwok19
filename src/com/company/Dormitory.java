package com.company;

import com.company.Interfaces.Live;
import com.company.Interfaces.Rent;

public class Dormitory extends Family implements Rent, Live {
    public Dormitory(int quantity, String address) {
        super(quantity, address);
    }

    @Override
    public void rent() {
        System.out.println("We pay rent for dormitory in "+getAddress());
    }

    @Override
    public void live() {
        System.out.println("address is: "+getAddress()+", family members: "+getQuantity());
    }
}
