package SE.other;

import java.util.Scanner;

/**
 * @Author ZhengWen
 * @Date 2022/8/31 20:49
 * @Version 1.0
 */
public class ScannerDemo {
    public static void main(String[] args) {
//        创建一个扫描器对象以接受用户数据
        Scanner scanner = new Scanner(System.in);
        System.out.println("use next to get");
//判断有没有输入字符串
        if (scanner.hasNext()) {
            // 用next接收
            String getwords = scanner.next();//只接受了空白之前的
            System.out.println("输出内容为" + getwords);
//凡事属于io流的类如果不关闭会一直占用资源,要养成好习惯用完就关
            scanner.close();

        }
    }
}
