package com.mycompany.day03.loop;

public class Loop {
    public static void main(String[] args) {

    }

    public static void meow() {
        int count = 0;
        while (count < 3) {
            System.out.println("Meow");
            count++;
        }
    }

    public static void forMeow() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Meow");
        }
    }
}
