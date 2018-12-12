package designpatterns.builder.core;

/**
 * @author Kangshuai Zuo
 * @description 奥迪车制造工人
 * @date 2018/12/12 10:28
 */
public class BenzCarBuilder extends CarBuilder {

    Car benzCar = new BenzCar();

    @Override
    public void createName() {
        benzCar.name = "Benz";
    }

    @Override
    public void createWeight() {
        benzCar.weight = 23;
    }

    @Override
    public Car createCar() {
        return benzCar;
    }
}
