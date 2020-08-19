package ru.job4j.stream;

public class Profile {
    private String name;
    private Address adress;

    public Profile(String name, Address adress) {
        this.name = name;
        this.adress = adress;
    }

    public Address getAdress() {
        return adress;
    }
}
