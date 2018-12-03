package designpatterns.factorymethod.core;

/**
 * @description 具体的产品
 * @author Kangshuai Zuo
 * @date 2018/12/3 17:03
 */
public class ProductApple extends Product {

    @Override
    void create() {
        System.out.println("我用苹果造了罐头");
    }

}
