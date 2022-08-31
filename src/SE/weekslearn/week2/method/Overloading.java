package SE.weekslearn.week2.method;
//方法的重载
/*如果有两个方法的方法名相同，但参数不一致:就是()里的数据不一样比如(int n)和(String s)，
那么可以说一个方法是另一个方法的重载。 具体说明如下：
方法名相同
方法的参数类型，参数个不一样
方法的返回类型可以不相同
方法的修饰符可以不相同
main 方法也可以被重载*/
public class Overloading {
    //求两个int类型书的和
    public int plus (int m,int n){
        return m+n;
    }
    //求两个double类型数的和
    public double plus (double m,double n){
        return m+n;
    }
    //求两个数组元素的累加和
    public int plus(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){//从0开始不能<=
            sum+=a[i];//注意+=不要写错
        }
        return sum;
    }

    public static void main(String[] args) {
        int m=5,n=4;
        int a[]={1,2,3,4,5,6};
        Overloading mathDemo=new Overloading();
        System.out.println("int类型的和"+ mathDemo.plus(m,n));
        System.out.println("double类型的和"+mathDemo.plus(5.5,1.1));
        System.out.println("数组类型的和"+mathDemo.plus(a));//这里传数组名就行

    }
}
