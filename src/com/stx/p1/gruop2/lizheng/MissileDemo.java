package com.stx.p1.gruop2.lizheng;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @Author ZhengWen
 * @Date 2022/9/25 12:45
 * @Version 1.0
 */
/*
运用继承多态知识修改项目一，增加菜单：导弹发射，定义父类导弹，定义子类
近程导弹、中程导弹、远程导弹，重写父类发射的方法，根据菜单选择不同类型的导弹进行发射，实现不同的轰炸效果
 */
public class MissileDemo {
    public static void main(String[] args) {
        ArrayList<Missile> missiles = new ArrayList<>();
        //<>内填入Missile,就只能操作Missile内的类型
        while (true) {
            System.out.println("*****************************\n" +
                    "******欢迎进入导弹管理系统*******\n" +
                    "******************************\n" +
                    "******请输入相应编号选择功能*****\n" +
                    "____________________________________\n" +
                    "1.新增导弹信息\n" +
                    "2.导弹信息展示\n" +
                    "3.导弹入库\n" +
                    "4.导弹出库\n" +
                    "5.废弃过时导弹\n" +
                    "6.发射导弹\n" +
                    "7.退出系统\n"+
                    "____________________________________\n");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            switch (x) {
                case 1:
                    addMissileInformation(missiles);
                    break;
                case 2:
                    //导弹信息展示
                    checkMissile(missiles);
                    break;
                case 3:
                    addMissile(missiles);
                    break;
                case 4:
                    getMissile(missiles);
                    break;
                case 5:
                    delectMissile(missiles);
                    break;
                case 6:
                    missileShot(missiles);
                    break;
                case 7:
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误重新输入");
                    break;
            }
        }
    }
    //导弹进入

    /**
     * @param array 形参实际上是Missiles
     */
    public static void addMissileInformation(ArrayList<Missile> array) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入导弹型号：");
        String missileType = sc.nextLine();
        System.out.println("请输入导弹名称：");
        String missileName = sc.nextLine();
        System.out.println("请输入导弹生产国家");
        String missileProducingCountries = sc.nextLine();
        System.out.println("请输入导弹射程(km)短程(射程1000千米以下)、中程(射程1000~3000千米)、远程(射程3000~8000千米)");
        double missileRange = sc.nextDouble();
        System.out.println("请输入导弹初始入库数量");
        int missileNumber = sc.nextInt();
        //创建对象并赋值
        Missile missile = new Missile();
        missile.setMissileType(missileType);
        missile.setMissileName(missileName);
        missile.setMissileProducingCountries(missileProducingCountries);
        missile.setMissileRange(missileRange);
        missile.setMissileNumber(missileNumber);
        missile.setMissileRangeType(missileRange);
        missile.setDate();
        array.add(missile);
        //存入动态数组
        System.out.println("添加导弹信息成功");
        //响应存入成功

    }

    public static void checkMissile(ArrayList<Missile> array) {
        if (array.size() == 0) {
            System.out.println("暂无导弹信息可展示");
        } else {
            System.out.println("型号" + "    " + "名称" + "  " + "  生产国家" + "   数量" +"   射程(km)" + "   " +"导弹射程类型" +"   最新更改时间");
            //若无存入则反应无导弹信息可展示
            for (int i = 0; i < array.size(); i++) {
                Missile missile = array.get(i);
                System.out.println(missile.getMissileType() + "   " + missile.getMissileName() + "   " + missile.getMissileProducingCountries() + "     " + missile.getMissileNumber() + "   " + missile.getMissileRange() + "    " +missile.getMissileRangeType()+"   "+missile.getDate());
                //遍历以显示导弹信息
            }
        }
    }

    public static void addMissile(ArrayList<Missile> array) {
        //键盘录入要入库的导弹型号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要入库的型号：");
        String name = sc.nextLine();
        System.out.println("请输入你要入库的数量：");
        int num = sc.nextInt();
        boolean flag=true;
        //遍历集合将对应导弹型号对象并增加其数量
        for (int i = 0; i < array.size(); i++) {
            Missile missile = array.get(i);
            if (missile.getMissileType().equals(name)) {
                missile.addMissile2(num);
                missile.setDate();
                System.out.println(missile.getDate());
                break;
            } else {
                flag=false;
            }
        }
        if (flag==false){
            System.out.println("未找到所输入的型号,请检查是否输入有误");
        }
    }

    public static void getMissile(ArrayList<Missile> array) {
        //键盘录入要出库的导弹型号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要出库的型号：");
        String name = sc.nextLine();
        System.out.println("请输入你要出库的数量：");
        int num = sc.nextInt();
        boolean flag=true;
        //遍历集合将对应导弹型号对象并减少其数量
        for (int i = 0; i < array.size(); i++) {
            Missile missile = array.get(i);
            if (missile.getMissileType().equals(name)) {
                missile.getMissile2(num);
                missile.setDate();
                System.out.println(missile.getDate());
                break;
            } else {
                flag=false;
            }
        }
        if (flag==false){
            System.out.println("未找到所输入的型号,请检查是否输入有误");
        }
    }

    /**
     *
     * @param array
     */
    public static void missileShot(ArrayList<Missile> array) {
        boolean flag=true;
        while (flag) {
            System.out.println("*****************************\n" +
                    "******欢迎进入导弹发射系统*******\n" +
                    "******************************\n" +
                    "____________________________________\n" +
                    "1.发射近程导弹\n" +
                    "2.发射中程导弹\n" +
                    "3.发射远程导弹\n" +
                    "4.退出系统\n"+
                    "____________________________________\n");
            //键盘录入要发射库的导弹型号
            Scanner sc2 = new Scanner(System.in);
            int x = sc2.nextInt();
            switch (x) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("请输入你要发射的型号：");
                    String name = sc.nextLine();
                    System.out.println("请输入你要发射的数量：");
                    int num = sc.nextInt();
                    boolean flag2=true;
                    //遍历集合将对应导弹型号对象并减少其数量
                    for (int i = 0; i < array.size(); i++) {
                        Missile missile = array.get(i);
                        if (missile.getMissileType().equals(name)&&(missile.getMissileRange()>=0&&missile.getMissileRange()<1000)) {
                            missile.shotMissile(num);
                            missile.setDate();
                            Shot srm=new ShortRangeMissile();
                            srm.show1();
                            srm.show();
                            System.out.println(missile.getMissileName()+"的剩余数量为"+missile.getMissileNumber()+"注意库存量");
                            break;
                        }else {
                            flag2=false;
                        }
                    }
                    if (flag2==false){
                        System.out.println("未找到所输入的型号,请检查是否输入有误");
                    }
                    break;
                case 2:
                    Scanner sc3 = new Scanner(System.in);
                    System.out.println("请输入你要发射的型号：");
                    String name3 = sc3.nextLine();
                    System.out.println("请输入你要发射的数量：");
                    int num3 = sc3.nextInt();
                    boolean flag3=true;
                    //遍历集合将对应导弹型号对象并减少其数量
                    for (int i = 0; i < array.size(); i++) {
                        Missile missile = array.get(i);
                        if (missile.getMissileType().equals(name3)&&(missile.getMissileRange()>=1000&&missile.getMissileRange()<3000)) {
                            missile.shotMissile(num3);
                            missile.setDate();
                            Shot mrm=new MiddleRangeMissile();
                            mrm.show1();
                            mrm.show();
                            System.out.println(missile.getMissileName()+"的剩余数量为"+missile.getMissileNumber()+"注意库存量");
                            break;
                        } else {
                            flag3=false;
                        }
                    }
                    if (flag3==false){
                        System.out.println("未找到所输入的型号,请检查是否输入有误");
                    }
                    break;
                case 3:
                    Scanner sc4 = new Scanner(System.in);
                    System.out.println("请输入你要发射的型号：");
                    String name4 = sc4.nextLine();
                    System.out.println("请输入你要发射的数量：");
                    int num4 = sc4.nextInt();
                    boolean flag4=true;
                    //遍历集合将对应导弹型号对象并减少其数量
                    for (int i = 0; i < array.size(); i++) {
                        Missile missile = array.get(i);
                        if (missile.getMissileType().equals(name4)&&(missile.getMissileRange()>=3000&&missile.getMissileRange()<8000)) {
                            missile.shotMissile(num4);
                            missile.setDate();
                            Shot frm=new FarRangeMissile();
                            frm.show1();
                            frm.show();
                            System.out.println(missile.getMissileName()+"的剩余数量为"+missile.getMissileNumber()+"注意库存量");
                            break;
                        }else {
                            flag4=false;
                        }
                    }
                    if (flag4==false){
                        System.out.println("未找到所输入的型号,请检查是否输入有误");
                    }
                    break;
                case 4:
                    flag=false;
                    break;
                default:
                    System.out.println("输入有误重新输入");
                    break;
            }
        }
    }
    public static void delectMissile(ArrayList<Missile> array) {
        //键盘录入要废弃的导弹型号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要废弃的型号：");
        String name = sc.nextLine();
        boolean flag=true;
        for (int i = 0; i < array.size(); i++) {
            Missile missile = array.get(i);
            if (missile.getMissileType().equals(name)) {
                System.out.println("确定要废弃吗,当前导弹是" + missile.getMissileProducingCountries() + "生产" + "射程是" + missile.getMissileRange() + "公里的强力导弹," + "而且库里还剩余" + missile.getMissileNumber() + "枚");
                System.out.println("输入yes继续删除,输入其他返回主页面");
                Scanner sc2 = new Scanner(System.in);
                String yesOrNo = sc2.nextLine();
                if ("yes".equals(yesOrNo)) {
                    array.remove(i);
                    System.out.println("废弃" + missile.getMissileName() + "成功");
                }
                break;
            } else {
                flag=false;
            }
        }
        if (flag==false){
            System.out.println("未找到所输入的型号,请检查是否输入有误");
        }

    }
}





