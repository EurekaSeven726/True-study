package com.stx.p4.lizheng;

public class homework04 {
    public static void main(String args[]){
        int countN=0,countO=0;//整俩变量用来统计出现几次
        char x='n';
        char y='o';//定义字符变量以统计
        String s="want you to know one thing";
        char a[]=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(x==a[i]){
                countN++;
            }
            else if(y==a[i]){
                countO++;
            }
        }
        if(countN==0){System.out.println("不存在n，检查你所输入的是否是你所想统计的");}
        if(countO==0){System.out.println("不存在o，检查你所输入的是否是你所想统计的");}
        System.out.println("字母n出现了："+countN+"次  "+"字母o出现了："+countO+"次");
    }
}
