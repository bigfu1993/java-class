package com.hspedu.modifier;

public class B {
    public void m1() {
        A a = new A();
        System.out.println("n1=" + a.n1);
        System.out.println("n2=" + a.n2);
        System.out.println("n3=" + a.n3);
//        System.out.println("n4="+a.n4); private同包不能访问
    }

}
