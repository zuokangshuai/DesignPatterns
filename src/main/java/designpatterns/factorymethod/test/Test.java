package designpatterns.factorymethod.test;

import designpatterns.factorymethod.core.Factory;
import designpatterns.factorymethod.core.Product;
import designpatterns.factorymethod.core.ProductFactoryApple;
import designpatterns.factorymethod.core.ProductFactoryOrange;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/12/3 17:17
 */
public class Test {

    public static void main(String[] args) {


        Factory factoryApple = new ProductFactoryApple();
        Product productA = factoryApple.createProduct("沙拉");
        productA.show();

        System.out.println("---------------------------------------------");

        Factory factoryOrange = new ProductFactoryOrange();
        Product productOrange = factoryOrange.createProduct("罐头");
        productOrange.show();
    }
}
