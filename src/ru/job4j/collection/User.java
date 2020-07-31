package ru.job4j.collection;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && name.equals(user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(User o) {
        int res = name.compareTo(o.name);
        if (res == 0) {
            res = Integer.compare(age, o.age);
        }
        return res;
    }

    public static void main(String[] args) {
        Set<User> users = new TreeSet<>();
    }
}
