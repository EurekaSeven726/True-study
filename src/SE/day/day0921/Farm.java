package SE.day.day0921;

/**
 * @Author ZhengWen
 * @Date 2022/9/21 9:07
 * @Version 1.0
 */
public class Farm {
    private String name;
    private Sheep[] sheep=new Sheep[10];

    /**
     *
     * @param sheep
     */
    public void feed(Sheep sheep){
        sheep.eat();
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }
}
