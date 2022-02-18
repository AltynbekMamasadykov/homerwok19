package com.company;

import com.company.Interfaces.Live;
import com.company.Interfaces.Utilities;

public class Flat extends Family implements Utilities, Live {


    public Flat(int quantity, String address) {
        super(quantity, address);
    }


    @Override
    public void utilities() {
        System.out.println("We pay utilities for flat in "+getAddress());
    }

    @Override
    public void live() {
        System.out.println("address is: "+getAddress()+", family members:"+getQuantity());
    }
}
