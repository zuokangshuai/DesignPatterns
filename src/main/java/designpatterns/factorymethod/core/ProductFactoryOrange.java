package designpatterns.factorymethod.core;

/**
 * @description 橘子工厂
 * @author Kangshuai Zuo
 * @date 2018/12/3 17:37
 */
public class ProductFactoryOrange implements Factory{

    @Override
    public Product createProdect(String productType) {
        return new ProductOrange();
    }
}
