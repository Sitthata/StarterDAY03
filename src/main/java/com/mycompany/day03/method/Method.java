package com.mycompany.day03.method;

public class Method {
    public static void main(String[] args) {

    }

    // method with no input and no output
    public static void sayHi() {
        System.out.println("Hi");
    }

    // method with input but no output
    public static void sayHiTo(String name) {
        System.out.println("Hi " + name);
    }

    public static int plusFive(int x) {
        return x + 5;
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static void testPlusFive() {
        int y = 10;
        int result = plusFive(y);
        System.out.println(result);
        plusFive(y);
        System.out.println(y);
    }
}
