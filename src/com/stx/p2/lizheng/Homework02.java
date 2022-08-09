package com.stx.p2.lizheng;

public class Homework02
{
    public static void main(String[] args) {
            double i;//定义纸的厚度待会赋值
            int count=0;//定义count作为计数
            for(i=0.2;i<=8848860;i*=2){/**第一次折叠未计入，所以初值为折叠后的0.2，
                将8848米换成毫米级单位**/
                count++;
                System.out.println("这是第"+count+"次");
                System.out.println("现在i为"+i);
            }
            count+=1;//最后一次超过但未计入手动加一
            System.out.println("要叠"+count+"次");
        }
}
