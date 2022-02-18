package com.company;

import com.company.Interfaces.Live;
import com.company.Interfaces.Rent;

public class Hostel extends Family implements Rent, Live {
    public Hostel(int quantity, String address) {
        super(quantity, address);
    }

    @Override
    public void rent() {
        System.out.println("We pay rent for hostel in "+getAddress());
    }

    @Override
    public void live() {
        System.out.println("address is: "+getAddress()+", family members: "+getQuantity());
    }
}
