package SE.day.day0919;

/**
 * @Author ZhengWen
 * @Date 2022/9/19 16:30
 * @Version 1.0
 */
public class Student {
//    属性
//    学号
    public String num;
//    姓名
    public String name;
//    年龄
    public int age;
    //行为 方法
    //默认构造函数,不带参数Student()和类同名主要完成对象的初始化工作
    public Student(String num1,String name1,int age1){
        num=num1;
        name=name1;
        age=age1;
    }

    public Student() {

    }

    //有参构造函数给属性初始化
    public void study(){
        System.out.println(name+"学习");
    }

    /**
     *
     * @param food 参数 吃的食物
     */
    public void havefood(String food){
        System.out.println("吃"+food);

    }

}
