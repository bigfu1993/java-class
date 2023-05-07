package com.hspedu.object_;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("sun", "巡山");
        System.out.println(monster.toString());
        System.out.println(monster);
    }
}
class Monster{
    private String name;
    private String job;

    public Monster(String name, String job) {
        this.name = name;
        this.job = job;
    }
//    public String toString(){
//        return this.name + "&" + this.job;
//    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
