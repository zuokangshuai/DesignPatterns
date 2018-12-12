package designpatterns.builder.test;

import designpatterns.builder.core.*;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/12/12 10:36
 */
public class Test {

    public static void main(String[] args) {
        CarBuilder audiCarBuilder = new AudiCarBuilder();
        Car audiCar = Director.getCar(audiCarBuilder);
        System.out.println(audiCar.name);
        System.out.println(audiCar.weight);
        audiCar.drive();

        System.out.println("***************************");

        CarBuilder benzCarBuilder = new BenzCarBuilder();
        Car benzCar = Director.getCar(benzCarBuilder);
        System.out.println(benzCar.name);
        System.out.println(benzCar.weight);
        benzCar.drive();

    }


}
