package SE.other;

import java.util.Scanner;

/**
 * @Author ZhengWen
 * @Date 2022/8/31 21:07
 * @Version 1.0
 */
public class ScannerDemo2 {
    public static void main(String[] args) {
//        创建一个扫描器对象以接受用户数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("use next to get");
//判断有没有输入字符串
        if (scanner.hasNextLine()) {
            // 接受到了回车之前的所有
            String getwords2 = scanner.nextLine();
            System.out.println("输出内容为" + getwords2);
            scanner.close();

        }
    }
}
