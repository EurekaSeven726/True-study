package SE.weekslearn.基本;

/**
 * @Author ZhengWen
 * @Date 2022/9/6 20:28
 * @Version 1.0
 */
public class DiGui {//递归在方法里调用自己

    public static void main(String[] args) {
        System.out.println(add100(100));
    }
    public static int add100(int i){
        if (i>=1){
            return i+add100(--i);
        }
        return 0;
    }
}
