package com.stx.test;

/**
 * @Author ZhengWen
 * @Date 2022/9/28 16:23
 * @Version 1.0
 */
class MyTest extends Test {
    static {
        System.out.print("6");
    } {
        System.out.print("7");
    }
    public MyTest(int j) {
        super();
        System.out.print("8");
    }
}
public class Test {
    static {
        System.out.print("1");
    } {
        System.out.print("2");
    }
    public static void main(String[] args) {
        new MyTest(1);
        new MyTest(2);
    }
    public Test() {
        System.out.print("3");
    }
    public Test(int j) {
        System.out.print("4");
    }
}