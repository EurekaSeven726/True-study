package com.stx.p1.gruop2.lizheng;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author ZhengWen
 * @Date 2022/9/25 12:45
 * @Version 1.0
 */
public class Missile {
    private String missileType;
    private String missileName;
    private String missileProducingCountries;
    private double missileRange;
    private int missileNumber;
    private String date;
    private String missileRangeType;

    public String getMissileRangeType() {
        return missileRangeType;
    }

    public void setMissileRangeType(double missileRange) {
        if (missileRange>=0&&missileRange<1000){
            this.missileRangeType="短程导弹";
        }else if(missileRange>=1000&&missileRange<3000){
            this.missileRangeType="中程导弹";
        }else if(missileRange>=3000&&missileRange<=8000){
            this.missileRangeType="远程导弹";
        }else {
            System.out.println("不是本系统可输入的射程类型");
        }
    }

    public void addMissile2(int missileNumber) {
        this.missileNumber = this.missileNumber + missileNumber;
        System.out.println("导弹型号为" + this.missileType + "入库成功," + "入库数量为" + this.missileNumber + "更新时间为");
    }

    public void getMissile2(int missileNumber) {
        if (this.missileNumber - missileNumber < 0) {
            System.out.println("导弹型号为" + this.missileType + "剩余数量不足" + "出库数量为" + this.missileNumber + "更新时间为");
            this.missileNumber = 0;
        } else if (this.missileNumber - missileNumber >= 0) {
            System.out.println("导弹型号为" + this.missileType + "出库成功," + "出库数量为" + missileNumber + "更新时间为");
            this.missileNumber = this.missileNumber - missileNumber;
        }
    }
    public void shotMissile(int missileNumber) {
        if (this.missileNumber - missileNumber < 0) {
            System.out.println("导弹型号为" + this.missileType + "剩余数量不足" + "发射数量为" + this.missileNumber  );
            this.missileNumber = 0;
        } else if (this.missileNumber - missileNumber >= 0) {
            System.out.println("导弹型号为" + this.missileType + "发射成功," + "发射数量为" + missileNumber );
            this.missileNumber = this.missileNumber - missileNumber;
        }
    }

    public Missile() {
    }

    public Missile(String missileType, String missileName, String missileProducingCountries, double missileRange, int missileNumber, String missileRangeType) {
        this.missileType = missileType;
        this.missileName = missileName;
        this.missileProducingCountries = missileProducingCountries;
        this.missileRange = missileRange;
        this.missileNumber = missileNumber;
        this.missileRangeType = missileRangeType;
    }

    public String getDate() {
        return date;
    }

    public void setDate() {
        SimpleDateFormat sdf = new SimpleDateFormat();
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        this.date = sdf.format(date);
    }

    public String getMissileType() {
        return missileType;
    }

    public void setMissileType(String missileType) {
        this.missileType = missileType;
    }

    public String getMissileName() {
        return missileName;
    }

    public void setMissileName(String missileName) {
        this.missileName = missileName;
    }

    public String getMissileProducingCountries() {
        return missileProducingCountries;
    }

    public void setMissileProducingCountries(String missileProducingCountries) {
        this.missileProducingCountries = missileProducingCountries;
    }

    public double getMissileRange() {
        return missileRange;
    }

    public void setMissileRange(double missileRange) {
        this.missileRange = missileRange;
    }

    public int getMissileNumber() {
        return missileNumber;
    }

    public void setMissileNumber(int missileNumber) {
        this.missileNumber = missileNumber;
    }
}
