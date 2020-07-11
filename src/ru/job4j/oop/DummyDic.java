package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummiDic = new DummyDic();
        System.out.println(dummiDic.engToRus("apple"));
    }
}
