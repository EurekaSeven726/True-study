package SE.weekslearn.week2.method;

public class ArgsDemo {
    //求和
	public void sum(int... n){//表示有n个整形变量
		int sum=0;
		for(int i:n){//直到取完n个
			sum=sum+i;
		}
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		ArgsDemo ad=new ArgsDemo();
		ad.sum(1);
		ad.sum(1,2);
		ad.sum(1,2,3);
	}

}
