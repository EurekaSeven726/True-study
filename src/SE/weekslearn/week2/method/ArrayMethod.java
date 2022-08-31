package SE.weekslearn.week2.method;

import java.util.Scanner;

public class ArrayMethod {
    //打印输出数组元素的值
    public void printArray(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"      ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        SE.weeks.week2.method.ArrayMethod am=new SE.weeks.week2.method.ArrayMethod();
        am.printArray(arr);
    }

}
