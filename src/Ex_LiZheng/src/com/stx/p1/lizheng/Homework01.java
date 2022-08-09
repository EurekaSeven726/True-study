package com.stx.p1.lizheng;

import java.util.Scanner;

public class Homework01
{
    public static void main(String[] args) {
        int i;
        System.out.println("请输入0-6以判断是星期几");
        Scanner xxday= new Scanner(System.in);
        i=xxday.nextInt();
        switch (i){
            case 0:System.out.println("今天是星期天");break;
            case 1:System.out.println("今天是星期一");break;
            case 2:System.out.println("今天是星期二");break;
            case 3:System.out.println("今天是星期三");break;
            case 4:System.out.println("今天是星期四");break;
            case 5:System.out.println("今天是星期五");break;
            case 6:System.out.println("今天是星期六");break;
            default:System.out.println("输入有误，请重新输入");
        }
    }
}
