package ru.job4j.condition;

public class Cinema {

    public static final int ACCESS_AGE = 18;

    public static void access(int age) {
        System.out.println("The age of the customer is : " + age);
        if (age >= ACCESS_AGE) {
            System.out.println("Welcome to the cinema.");
        } else {
            System.out.println("It is not for you.");
        }
    }

    public static void main(String[] args) {
        Cinema.access(21);
        Cinema.access(16);

    }
}
