package com.stx.test;

import java.util.Scanner;

/**
 * @Author ZhengWen
 * @Date 2022/11/2 20:03
 * @Version 1.0
 */
public class one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y=0;
        for (int i = 1; i <=x; i++) {
            y+=i;
        }
        System.out.println(y);
    }

}
