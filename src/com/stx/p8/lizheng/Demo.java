package com.stx.p8.lizheng;

import java.util.Scanner;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 17:02
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
public class Demo {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setName("李田所");
        student1.setAge(24);
        student1.setScore(100);
        student1.setSex("男");
        student1.setNum("114514");
        Student student2=new Student("李田金","114515","男",24,100);
        Student student3=new Student("李田木","114516","男",24,100);
        Student student4=new Student("李田水","114517","男",24,100);
        Student student5=new Student("李田火","114518","男",24,100);
        Student student6=new Student("李田土","114519","男",24,100);
        Student student7=new Student("李田土","114519","男",24,100);
        Student student8=new Student("李田土","114519","男",24,100);
        Student student9=new Student("李田土","114519","男",24,100);
        Student student10=new Student("李田土","114519","男",24,100);
        Student student11=new Student("李田土","114519","男",24,100);
        Student student12=new Student("李田土","114519","男",24,100);
        Student student13=new Student("李田土","114519","男",24,100);
        Student student14=new Student("李田土","114519","男",24,100);
        Student student15=new Student("李田土","114519","男",24,100);
        Student student16=new Student("李田土","114519","男",24,100);
        Student student17=new Student("李田土","114519","男",24,100);
        Student student18=new Student("李田土","114519","男",24,100);
        Student student19=new Student("李田土","114519","男",24,100);
        Student student21=new Student("李田土","114519","男",24,100);
        Student student22=new Student("李田土","114519","男",24,100);
        Student student23=new Student("李田土","114519","男",24,100);
        Student student24=new Student("李田土","114519","男",24,100);
        Student student25=new Student("李田土","114519","男",24,100);
        Student student26=new Student("李田土","114519","男",24,100);
        Student student27=new Student("李田土","114519","男",24,100);
        Student student28=new Student("李田土","114519","男",24,100);
        Student student29=new Student("李田土","114519","男",24,100);
        Student student20=new Student("李田土","114519","男",24,100);
        Student student30=new Student("李田土","114519","男",24,100);
        Student student31=new Student("李田土","114519","男",24,100);
        Student student32=new Student("李田土","114519","男",24,100);
        Student student33=new Student("李田土","114519","男",24,100);
        Student student34=new Student("李田土","114519","男",24,100);
        Student student35=new Student("李田土","114519","男",24,100);
        Student student36=new Student("李田土","114519","男",24,100);
        Student[]group1number={student1,student2,student3,student4,student5,student6};
        Group group1=new Group("1组",student1,group1number);
        Student[]group2number={student7,student8,student9,student10,student11,student12};
        Group group2=new Group("2组",student7,group2number);
        Student[]group3number={student13,student14,student15,student16,student17,student18};
        Group group3=new Group("3组",student13,group3number);
        Student[]group4number={student19,student20,student21,student22,student23,student24};
        Group group4=new Group("4组",student19,group4number);
        Student[]group5number={student25,student26,student27,student28,student29,student30};
        Group group5=new Group("5组",student25,group5number);
        Student[]group6number={student31,student32,student33,student34,student35,student36};
        Group group6=new Group("6组",student31,group6number);
        Group[]groups={group1,group2,group3,group4,group5,group6};
        Classroom classDemo = new Classroom("天韵三部",student1,groups);

        System.out.println("输入0以直接查看所有信息,输入组号以查看各组信息,共有六组");
        Scanner sc=new Scanner(System.in);
                int x= sc.nextInt();
        switch (x){
            case 0:classDemo.introduce();
            break;
            case 1:group1.introduce();
                break;
            case 2:group2.introduce();
                break;
            case 3:group3.introduce();
                break;
            case 4:group4.introduce();
                break;
            case 5:group5.introduce();
                break;
            case 6:group6.introduce();
                break;
        }
    }
}
