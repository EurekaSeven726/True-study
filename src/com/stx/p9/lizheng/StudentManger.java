package com.stx.p9.lizheng;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 19:48
 * @Version 1.0
 */
/*二、学生管理系统
功能：菜单显示
****************************
******  学生管理系统  ******
****************************
1、添加学生
2、查看学生
3、修改学生
4、删除学生
5、退出系统
选择菜单进入相对应功能*/
public class StudentManger {
    public static void main(String[] args) {
        ArrayList<Student> s = new ArrayList<Student>();
        while(true) {//循环以重复使用管理界面
            System.out.println("****************************\n" +
                    "******  学生管理系统  ******\n" +
                    "****************************\n" +
                    "1、添加学生\n" +
                    "2、查看学生\n" +
                    "3、修改学生\n" +
                    "4、删除学生\n" +
                    "5、退出系统\n" +
                    "选择菜单进入相对应功能");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    addStudent(s);
                    //添加方法
                    break;
                case 2:
                    checkStudent(s);
                    break;
                //查看
                case 3:
                    changeStudent(s);
                    //更新
                    break;
                case 4:
                    deleteStudent(s);
                    //删除
                    break;
                case 5:
                    System.out.println("退出系统");
                    System.exit(0);//退出
                default:
                    System.out.println("你输入的不符合选项");
            }
        }
    }
    //添加学生
    public static void addStudent(ArrayList<Student>array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生学号：");
        String num= sc.nextLine();
        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        //创建对象并赋值
        Student s = new Student();
        s.setName(name);
        s.setNum(num);
        array.add(s);//存入集合
        System.out.println("添加学生成功");
    }

    //查看学生信息的方法
    public static void checkStudent(ArrayList<Student> array) {
        if (array.size() == 0) {
            System.out.println("暂无学生录入");
        }
        for(int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getNum()+"\t"+s.getName()+"\t");//遍历以显示学号和名字
        }

    }
    //删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        //键盘录入要删除的学生学号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String num = sc.nextLine();
        //遍历集合将对应学生对象从集合中删除
        for(int i=0; i<array.size(); i++){
            Student s = array.get(i);
            if(s.getNum().equals(num)){
                array.remove(i);
                break;
            }
        }
        System.out.println("删除学生成功");
    }
    //修改学生信息
    public static void changeStudent(ArrayList<Student> array){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要修改的学生的学号：");
        String num = sc.nextLine();
        System.out.println("请输入学生新姓名；");
        String name = sc.nextLine();
        //创建学生对象
        Student s = new Student();
        s.setNum(num);
        s.setName(name);
        //遍历集合修改对应的学生信息
        for(int i=0; i<array.size(); i++){
            Student student = array.get(i);
            if(student.getNum().equals(num)){
                array.set(i,s);
                break;
            }
        }
        //给出修改成功提示
        System.out.println("修改学生成功");
        //调用方法
    }

}



