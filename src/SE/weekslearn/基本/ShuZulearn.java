package SE.weekslearn.基本;

public class ShuZulearn {
    public static void main(String[] args) {
        float boy[];
        boy = new float[4];  //或者float boy[]=new float [4]
        boy[0]=123;//一定要在boy[0]start
        boy[1]=123f;
        boy[2]=11344.2f;
        boy[3]=7271.2f;
        for(int i=0;i<4;i++) {
            System.out.println(boy[i]);
        }
        float girl[][]=new float[2][2];
        girl[0][0]=1;
        girl[0][1]=2;
        girl[1][0]=3;
        girl[1][1]=4;
        for(int x=0;x<2;x++) {
            for(int y=0;y<2;y++) {
                System.out.println(girl[x][y]);
            }
        }
        System.out.println(girl.length);//一维数组的个数
    }

}
