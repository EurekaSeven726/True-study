package com.stx.p9.lizheng;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 19:59
 * @Version 1.0
 */
public class Student {
    private String name;//名字
    private String num;//学号

    public Student() {//无参构造方法
    }

    public Student(String name, String num) {//有参
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
