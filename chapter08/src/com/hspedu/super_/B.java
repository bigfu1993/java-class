package com.hspedu.super_;

public class B extends A {
    public void test() {
//        访问父类非private属性和方法
        System.out.println(super.n2 + " " + super.n3 + " " + super.n4);
        super.f2();
        super.f3();
        super.f4();
    }
}
