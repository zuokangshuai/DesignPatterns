package designpatterns.factorymethod.core;

/**
 * @author Kangshuai Zuo
 * @description 具体工厂类
 * @date 2018/12/3 16:52
 */
public class ProductFactoryApple implements Factory{


    @Override
    public Product createProdect(String productType) {
        return new ProductApple();
    }
}
