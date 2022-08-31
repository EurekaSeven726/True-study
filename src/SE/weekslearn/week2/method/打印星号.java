package SE.weekslearn.week2.method;

import java.util.Scanner;

public class 打印星号 {
    public void star(){
        System.out.println("########");
    }
    public static void main(String[] args) {
        Scanner starString=new Scanner(System.in);
        System.out.println("*********");
        打印星号 星=new 打印星号();
        星.star();
        System.out.println("*********");
    }

}
