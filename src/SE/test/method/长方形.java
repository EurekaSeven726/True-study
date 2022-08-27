package SE.test.method;

public class 长方形 {
    public static void main(String[] args) {
        长方形 area1=new 长方形();
        int j=area1.canshu(2,2);
        System.out.println(j);
    }
    public int canshu(int x,int y){
        int area;
        area=x*y;
        return area;
    }
}
