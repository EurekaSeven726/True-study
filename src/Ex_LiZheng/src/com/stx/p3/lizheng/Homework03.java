package com.stx.p3.lizheng;

import java.util.Arrays;
import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {
        int a1 []={114,514,19,198,10,22,33,44,55,66};//定义一个数组
        int a2 []=maoPao(a1);//不能用api就先用冒泡，a2用来接受排序后,调用冒泡
        System.out.println(Arrays.toString(a2));/*输出字符型的数组，所以要改一下数组
         */
        System.out.println("输入一个数字");
        Scanner x=new Scanner(System.in);
        int x1= x.nextInt();
        getNum(a2,x1);

    }
    public static int[] maoPao(int[] a1) {
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = 0; j < a1.length - 1 - i; j++) {
                if (a1[j] < a1[j + 1]) {//一般冒泡是升序，把大于号改成小于来降序
                    int temp = a1[j];
                    a1[j] = a1[j + 1];
                    a1[j + 1] = temp;
                }
            }
        }
        return a1;
    }
    public static int getNum(int[]a2,int x1){
        int x=0;//用来判断是否存在
        for (int i = 0; i < a2.length; i++) {
            if (x1 == a2[i]){
                x=1;
            }
        }
        if (x == 1){
            System.out.println("此数字存在于该数组");
        }else{
            System.out.println("此数字不存在于该数组");
        }
        return 0;
    }
}
