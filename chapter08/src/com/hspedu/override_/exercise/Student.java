package com.hspedu.override_.exercise;

public class Student extends Person {
    private int id;
    private double score;

    public Student(String name, int age, int id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String say() {
        return super.say() + ";score=" + this.score + ";id=" + this.id;
//        return "name="+this.getName()+";age="+this.getAge()+";score="+this.score+";id="+this.id;
    }
}
