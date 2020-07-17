package ru.job4j.poly;

public interface Transport {
    void move();

    void passengers(int count);

    int tankUp(int fuel);
}
