package com.hspedu.object_;


public class Equals {
    public static void main(String[] args) {
        Person person1 = new Person("zs", 20, '男');
        Person person2 = new Person("zs", 20, '男');
        System.out.println(person1.equals(person2));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    //重写object equals方法
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Person) {
            Person p = (Person) o;
            return p.name.equals(this.name) && p.age == this.age && p.gender == this.gender;
        }
        return false;
    }
}

class Per{
    int age;
    String name;

    public Per(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}