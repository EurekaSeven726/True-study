package SE;

import java.util.Scanner;

public class Scannerlearn {
    public static void main(String[] args) {
        System.out.println("please input a number");
        Scanner reader = new Scanner(System.in);//Scanner方法不能搞字符和句子
        int a= 123;
        System.out.println("输入为"+reader.nextInt());

    }
}
