package designpatterns.builder.core;

/**
 * @author Kangshuai Zuo
 * @description 汽车生产工人抽象类
 * @date 2018/12/12 10:25
 */
public abstract class CarBuilder {

    /** 给汽车贴标*/
    public abstract void createName();

    /** 制造车的重量 */
    public abstract void createWeight();

    public abstract Car createCar();

}
