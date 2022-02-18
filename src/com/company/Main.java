package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println();

        Flat flat = new Flat(5,"Djal 15");
        flat.utilities();
        flat.live();

        System.out.println();

        Hostel hostel = new Hostel(2,"Djal 23");
        hostel.rent();
        hostel.live();

        System.out.println();

        Dormitory dormitory = new Dormitory(4,"Djal 39");
        dormitory.rent();
        dormitory.live();
    }
}
