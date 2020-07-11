package ru.job4j.oop;

public class Battery {
    private int value;

    public Battery(int size) {
        this.value = size;
    }

    public void exchange(Battery another) {
        another.value += value;
        value = 0;
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(10);
        Battery b2 = new Battery(5);
        System.out.println("first battery: " + b1.value + ". second battery: " + b2.value);
        b1.exchange(b2);
        System.out.println("first battery: " + b1.value + ". second battery: " + b2.value);
    }
}
