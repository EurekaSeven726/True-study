package SE.test;

/**
 * @Author ZhengWen
 * @Date 2022/9/14 16:18
 * @Version 1.0
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1="helloworld";
        String s2="helloworld";
        System.out.println(s1==s2);
        //指向字符串池中对象,地址一样True
        String s3=new String("helloworld");
        System.out.println(s1==s3);
        //池里面已经有了,new了又重新开辟了空间所以两个不一样false
        String s4=new String("helloworld");
        System.out.println(s4==s3);
        //又new出来了一个,所以又不等false
        String s5="hello"+"world";
        System.out.println(s1==s5);
        //true


        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s3));
        //equals比较字符串内容
        String a="test";
        String b="3";
        String c=a+b;
        //test3
        String d="test"+"3";
        //test3
        String e=a+2+1;
        //test21
        String f=a+(2+1);
        //test3
        String g=a.concat("3");
        //test3
        int a1=1,b1=2;
        System.out.println();

        String test="hello";
        test=test+"world";
        //这里的拼接是new了一个对象和s5不一样,所以是false
        System.out.println(s1==test);
        System.out.println(test.substring(1));

    }
}
