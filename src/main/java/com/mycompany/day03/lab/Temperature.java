package com.mycompany.day03.lab;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Temperature converter");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Fahrenheit to Kelvin");
            System.out.println("4. Kelvin to Fahrenheit");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    convertCelsiusToFahrenheit(sc);
                    break;
                case 2:
                    convertFahrenheitToCelsius(sc);
                    break;
                case 3:
                    convertFahrenheitToKelvin(sc);
                    break;
                case 4:
                    convertKelvinToFahrenheit(sc);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }

    public static void convertCelsiusToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void convertFahrenheitToCelsius(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Temperature in Celsius: " + celsius);
    }

    public static void convertFahrenheitToKelvin(Scanner scanner) {
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        double kelvin = (fahrenheit + 459.67) * 5 / 9;
        System.out.println("Temperature in Kelvin: " + kelvin);
    }

    public static void convertKelvinToFahrenheit(Scanner scanner) {
        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = scanner.nextDouble();
        double fahrenheit = (kelvin * 9 / 5) - 459.67;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }




}
