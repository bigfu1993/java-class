package com.hspedu.object_;

public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("zs", 20, '男');
        Person person2 = new Person("ls", 20, '男');
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private  int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}