package com.mycompany.day03.Droid;

public class Droid {
    private String name;
    private int battery;

    // Constructor
    public Droid(String name, int battery) {
        this.name = name;
        this.battery = battery;
    }

    // Getter and Setter methods
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBattery() {
        return this.battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    // performTask method
    public void performTask(String task) {
        if(battery >= 10){
            System.out.println(name + " is performing task: " + task);
            battery -= 10;
        }else{
            System.out.println(name + " doesn't have enough battery to perform the task.");
        }
    }

    // chargeBattery method
    public void chargeBattery(int amount) {
        System.out.println("Charging " + name + "'s battery by " + amount + " units.");
        battery = Math.min(100, battery + amount);
    }

    // Overriding the toString method
    @Override
    public String toString() {
        return String.format("Droid - %s : %d", name, battery);
    }
}
