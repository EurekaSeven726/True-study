package SE.weekslearn.week2.method;

/**
 * 关于可变参数列表和重载的问题
 * @author eureka
 * @version 1.0
 *
 */
//可变参数列表所在的方法是最后被访问的。
//如果能使用不带就不带
public class ArgDemo3 {
    public int plus(int a,int b){
        System.out.println("不带可变参数的方法");
        return a+b;
    }
    public int plus(int...a){
        int sum=0;
        System.out.println("带可变参数的方法");
        for(int n:a){
            sum=sum+n;
        }
        return sum;
    }
    public static void main(String[] args) {
        ArgDemo3 argDemo3=new ArgDemo3();
        System.out.println("和为"+ argDemo3.plus(1,3));

    }
}
