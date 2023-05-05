package com.hspedu.override_;

public class Dog extends Animal {
    public void say(){
        System.out.println("dog say");
    }
    public String m1(){
        System.out.println("dog m1");
        return null;
    }
//    object > string 子类返回类型>父类返回类型，报错不构成重写
//    public Object m2(){
//        System.out.println("dog m2");
//        return null;
//    }


//    protected < public 子类访问权限<父类访问权限，报错不构成重写
//    protected Object m3(){
//        System.out.println("dog m3");
//        return null;
//    }
}
