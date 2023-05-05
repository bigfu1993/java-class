package com.hspedu.super_;

public class A {
    private int n1  = 100;
    protected int n2 = 200;
    int n3 = 300;
    public int n4 = 400;

    private void f1(){
        System.out.println("private f1");
    }
    protected void f2(){
        System.out.println("protected f2");
    }
     void f3(){
        System.out.println("default f3");
    }
    public void f4(){
        System.out.println("public f4");
    }
}
