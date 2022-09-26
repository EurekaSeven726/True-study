package com.stx.homework;

/**
 * @Author ZhengWen
 * @Date 2022/9/4 21:29
 * @Version 1.0
 */
public class print2 {
    // 打印输出星号的方法
    public void printStar() {
        System.out.println("*****************************");
    }

    public static void main(String[] args) {
        //声明一个print2类的对象printstar
        print2 printstar=new print2();
        //使用对象名.方法名()去调用方法
        printstar.printStar();
        System.out.println("*********java程序设计*********");
        printstar.printStar();
    }
}
