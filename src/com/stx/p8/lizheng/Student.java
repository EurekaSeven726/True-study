package com.stx.p8.lizheng;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 19:23
 * @Version 1.0
 */
/*一、模拟班级学生情况介绍
1、声明学生类，包含姓名、学号、性别、年龄、成绩属性
自我介绍方法（我叫xx，学号xx，男，xx岁，成绩xx分）
2、声明组类，包含组名、组长、6个学生属性，
介绍组情况的方法（组名xx，组长xx，学生情况是-学生自我介绍方法）
3、声明班级，包含班级名称，班长，6个组
介绍班级情况的方法（班名xx，班长xx，有6个组分别是-组情况方法）
要求：
所有成员私有*/
public class Student {
    private String name;
    private String num;
    private String sex;
    private int age;
    private int score;

    public Student() {
    }

    public Student(String name, String num, String sex, int age, int score) {
        this.name = name;
        this.num = num;
        this.sex = sex;
        this.age = age;
        this.score = score;
    }

    public void introduce(){
        System.out.println(String.format("我叫%s，学号%s，%s，%d岁，成绩%d分",
                name,num,sex,age,score));
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
