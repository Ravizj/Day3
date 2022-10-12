package com.bridgelabz;

public class MethodType {
    int x=10;
    static int y=20;
    static void m1(){
        int y=67;
        System.out.println(y);
        System.out.println(MethodType.y);
        MethodType obj=new MethodType();
        System.out.println(obj.x);
        System.out.println("m1");
    }
    void m2(){
        int y=56;
        int x=32;
        System.out.println(x+"++");
        System.out.println(this.x);
        System.out.println();
        System.out.println(y);
        System.out.println(MethodType.y);
        System.out.println("m2");
    }
    public static void main(String[] args) {
        System.out.println(y);
        m1();
        MethodType obj=new MethodType();
        obj.m2();
        System.out.println(obj.x+"*");
        obj.x=30;
        obj.m2();


    }
}
