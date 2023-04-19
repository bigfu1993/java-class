package com.hspedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person("jakejakejake",220,20000);
        person.setName("jakejakejake");
        person.setAge(3000);
        person.setSalary(30000);
        String info = person.info();
        System.out.println("kkk:"+info);
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        this.setSalary(salary);
        this.setName(name);
        this.setAge(age);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if(name.length()>=2 && name.length()<=6){
            this.name = name;

        }else{
            System.out.println("设置名称异常，需要在（2-6）之间，默认设置为无名");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>=1 && age<=120){
            this.age = age;
        }else{
            System.out.println("设置年龄异常，需要在（1-120）之间，默认设置为18");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        System.out.println("name:" + this.name + " age:" + this.age + " salary:" + this.salary);
        return "name:" + this.name + " age:" + this.age + " salary:" + this.salary;
    }

}
