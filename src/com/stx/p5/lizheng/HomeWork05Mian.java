package com.stx.p5.lizheng;

public class HomeWork05Mian {
    public static void main(String[] args) {
        Student beautfulguy=new Student("大漂亮",20221234,"女",20,80);
        //默认是大漂亮的数据，利用set方法来变成自己的
        beautfulguy.setName("李政");
        beautfulguy.setId(2019210859);
        beautfulguy.setSex("男");
        beautfulguy.setAge(22);
        beautfulguy.setScore(100);
        beautfulguy.show();
    }
}
