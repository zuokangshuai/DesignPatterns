package designpatterns.builder.core;

/**
 * @description 汽车抽象类
 * @author Kangshuai Zuo
 * @date 2018/12/12 10:21
 */
public abstract class Car {

    /** 车标 */
    public String  name;

    /**  重量 */
    public Integer weight;

    /** 驾驶 */
    public abstract void drive();

}
