package SE.day.day0919;

/**
 * @Author ZhengWen
 * @Date 2022/9/19 16:35
 * @Version 1.0
 */
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象让对象去做事情
        Student student=new Student();
        //通过new关键字来创建
        //调用构造方法创建实例
        student.name="老八";
        student.age=42;
        student.num="213";
        System.out.println(student.age);
        student.study();
        //没有把名字告知电脑的话结果就是null学习
        student.havefood("美汁汁");
        //让对象做事情,调用对象的方法
        Student student3=new Student("2000222","老七",11);
        student3.havefood("饭");

    }
}
