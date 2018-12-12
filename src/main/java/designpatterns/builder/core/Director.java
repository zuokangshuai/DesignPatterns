package designpatterns.builder.core;

/**
 * @description 技术工程师
 * @author Kangshuai Zuo
 * @date 2018/12/12 10:33
 */
public class Director {

    /*** 车制造流程 */
    public static Car getCar(CarBuilder carBuilder){
        carBuilder.createName();
        carBuilder.createWeight();
        return carBuilder.createCar();
    }

}
