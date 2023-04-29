package com.hspedu.extend_;

public class Pupil {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public Pupil(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void test() {
        System.out.println("小学生" + this.name + "正在考试。。。");
    }

    public void showInfo() {
        System.out.println("姓名" + this.name + " 年龄" + this.age + " 成绩" + this.score);
    }
}
