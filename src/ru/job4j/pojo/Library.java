package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Fahrenheit 451", 300);
        Book book2 = new Book("1984", 438);
        Book book3 = new Book("Dune", 500);
        Book book4 = new Book("Clean code", 700);
        Book[] library = new Book[]{book1, book2, book3, book4};
        print(library);
        Book temp = library[3];
        library[3] = library[0];
        library[0] = temp;
        print(library);
        for (int i = 0; i < library.length; i++) {
            if (library[i].getTitle().equals("Clean code")) {
                System.out.print(library[i].getTitle() + ": " + library[i].getPages());
            }
        }
    }

    private static void print(Book[] library) {
        for (Book book : library) {
            System.out.println(book.getTitle() + ": " + book.getPages());
        }
        System.out.println("----------");
    }
}
