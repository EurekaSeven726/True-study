package com.stx.p5.lizheng;

public class Student {

        private int id;
        private String name;
        private int age;
        private String sex;
        private  int score;
        public Student (String name,int id,String sex,int age,int score){//初定义一个构造方法始化
            this.id=id;
            this.name=name;
            this.age=age;
            this.sex=sex;
            this.score=score;
        }
        //获取数据
    public void setId(int id) {
            this.id = id;
        }

    public int getId(){
            return id;//用来返回参数以此类推
        }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
   void show(){
            String level="有误";
if(score>80&&score<=100){
    level="A";
}else if(score<=80&&score>=60){
    level="B";
}
else if(score<60&&score>=0){
    level="C";
}else{
    System.out.println("检查是否输入有误");
}
       System.out.println("我叫"+name+",学号 "+id+","+sex+","+age+",岁"+"成绩等级为"+level);

    }

}
