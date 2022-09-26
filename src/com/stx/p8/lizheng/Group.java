package com.stx.p8.lizheng;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 19:26
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
public class Group {
    private String groupName;
    private Student leader;
    private Student []students;

    public Group() {
    }

    public Group(String groupName, Student leader, Student[] students) {
        this.groupName = groupName;
        this.leader = leader;
        this.students = students;
    }

    public void introduce(){
        System.out.println(String.format("组名%s，组长%s，学生情况是:",
                groupName,leader.getName()));
        for (int i = 0; i <students.length ; i++) {
            students[i].introduce();
        }
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Student getLeader() {
        return leader;
    }

    public void setLeader(Student leader) {
        this.leader = leader;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
}
