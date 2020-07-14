package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivanov Ivan Ivanovich");
        student.setGroup("DIT-115");
        student.setReceiptDate("01.09.2020");
        System.out.println("Student : " + student.getName() + " was credited at " + student.getReceiptDate() + " into the group " + student.getGroup());
    }
}
