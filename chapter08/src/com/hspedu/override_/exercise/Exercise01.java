package com.hspedu.override_.exercise;

public class Exercise01 {
    public static void main(String[] args) {
        Person zs = new Person("zs", 20);
        Student ls = new Student("ls", 22, 1, 24.5);
        System.out.println(zs.say());
        System.out.println(ls.say());

    }
}
