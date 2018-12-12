package designpatterns.builder.core;

import java.util.Locale;

/**
 * @author Kangshuai Zuo
 * @description 奥迪车制造工人
 * @date 2018/12/12 10:28
 */
public class AudiCarBuilder extends CarBuilder {

    Car audiCar = new AudiCar();

    @Override
    public void createName() {
        audiCar.name = "Audi";
    }

    @Override
    public void createWeight() {
        audiCar.weight = 22;
    }

    @Override
    public Car createCar() {
        return audiCar;
    }
}
