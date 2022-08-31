package SE.weekslearn.week2.method;

import java.util.Scanner;

public class max {
    public static void main(String[] args) {
        Scanner jk=new Scanner(System.in);
        Scanner po=new Scanner(System.in);

        System.out.println(max(3,4));
    }
    public static int max(int x,int y){
        int m=0;
        if(x>y) {
            m=x;
        }
        if(y>x) {
            m=y;
        }
        return m;
    }
}
