package com.stx.p5.lizheng;

public class Homework05Mian {
    public static void main(String[] args) {
        Student beautfulGuy=new Student("大漂亮",20221234,"女",20,80);
        //默认是大漂亮的数据，利用set方法来变成自己的
        beautfulGuy.setName("李政");
        beautfulGuy.setId(2019210859);
        beautfulGuy.setSex("男");
        beautfulGuy.setAge(22);
        beautfulGuy.setScore(100);
        beautfulGuy.show();
    }
}
