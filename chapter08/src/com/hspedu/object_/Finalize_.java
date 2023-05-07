package com.hspedu.object_;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("bmw");
        bmw = null;
        System.gc();
        System.out.println("程序结束");
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }
//    public void finalize(){
//        System.out.println("===");
//    }

    @Override
    protected void finalize() throws Throwable {
//        super.finalize();
        System.out.println("释放资源");
    }
}
