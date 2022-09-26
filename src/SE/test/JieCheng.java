package SE.test;

/**
 * @Author ZhengWen
 * @Date 2022/9/1 18:08
 * @Version 1.0
 */
public class JieCheng {
    public static void main(String[] args) {
        long s=1,sum=0;
        for (int m=1;m<=4;m++){
            s=1;
            for (int n=1;n<=m;n++){
                s=s*n;
            }
            sum=sum+s;
        }
        System.out.println("阶乘为"+sum);
    }
}
