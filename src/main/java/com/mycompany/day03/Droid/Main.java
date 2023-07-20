package com.mycompany.day03.Droid;

public class Main {
    public static void main(String[] args) {
        Droid droid1 = new Droid("Codey", 100);
        System.out.println(droid1);
        droid1.performTask("cleaning");
        System.out.println(droid1);
        droid1.chargeBattery(10);
        System.out.println(droid1);
    }

}
