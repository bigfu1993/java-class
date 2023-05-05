package com.hspedu.override_.exercise;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String say(){
        return "name="+this.name+";age="+this.age;
    }
}
