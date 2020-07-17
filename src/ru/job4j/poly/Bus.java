package ru.job4j.poly;

public class Bus implements Transport {
    int fuel = 0;

    @Override
    public void move() {
        System.out.println("Bus are moving");
    }

    @Override
    public void passengers(int count) {
        System.out.printf("You have %d passengers on board%n", count);
    }

    @Override
    public int tankUp(int fuel) {
        this.fuel += fuel;
        return fuel * 40;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.passengers(5);
        System.out.println("You've tanked up on " + bus.tankUp(10));
    }
}
