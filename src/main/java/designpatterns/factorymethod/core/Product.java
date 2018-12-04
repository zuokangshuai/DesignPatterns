package designpatterns.factorymethod.core;

/**
 * @description 产品抽象类
 * @author Kangshuai Zuo
 * @date 2018/12/3 17:01
 */
public abstract class Product {


    public final void show(){

        System.out.println("开始制作");
        create();
        System.out.println("出售");
    }

    abstract void create();

}
