package com.hspedu.debug_;

public class Debug02 {
    public static void main(String[] args) {
        Person jack = new Person("jack", 20);
        System.out.println(jack);
//        (1)加载类信息
//        (2)初始化 2.1默认初始化 2.2显式初始化 2.3构造器初始化
//        (3)返回对象地址
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}