package com.mycompany.day03.conditional;

import java.util.Scanner;

public class Pub {
    public static void main(String[] args) {
        swtichTest();
    }

    public static void swtichTest() {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("You chose 1");
                break;
            case 2:
                System.out.println("You chose 2");
                break;
            case 3:
                System.out.println("You chose 3");
                break;
            default:
                System.out.println("You chose something else");
        }
    }

    public static void canEnterPub() {
        // Problem: Some underage people are entering the pub
        // Solution: Check their age and only let them in if they are 18 or older
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = sc.nextInt();

        if (age > 18) {
            System.out.println("Welcome to the pub!");
        } else if (age < 18) {
            System.out.println("You are too young to enter the pub!");
        } else {
            System.out.println("You are not allowed to enter the pub!");
        }
    }


}
