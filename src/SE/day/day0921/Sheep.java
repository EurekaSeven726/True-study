package SE.day.day0921;

import java.sql.SQLOutput;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 9:03
 * @Version 1.0
 */
public class Sheep {
    private String name;
    private  int weight;
    public void eat(){
        weight++;
        System.out.println(name+"吃东西");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
