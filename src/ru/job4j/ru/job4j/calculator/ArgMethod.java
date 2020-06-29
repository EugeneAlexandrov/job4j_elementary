package ru.job4j.ru.job4j.calculator;

public class ArgMethod {
    public static void hello(String name, int age) {
        System.out.println("Hello, " + name+ ", "+age+" years");
    }
    public static void hello() {
        System.out.println("Hello, anonymous" );
    }
    public static void hello(int age) {
        System.out.println("Hello,"+age+" years anonymous" );
    }

    public static void main(String[] args) {
        String name = "Petr Arsentev";
        int age = 33;

        ArgMethod.hello();

        ArgMethod.hello(name, age);

        ArgMethod.hello(age);

    }
}
