package com.hspedu.pkg;

import com.hspedu.modifier.A;

public class Test {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.n1);
//       a.n2 a.n3 a.n4  protect 默认 private均不可访问
    }
}
