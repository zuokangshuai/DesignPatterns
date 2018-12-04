package designpatterns.factorymethod.core;

/**
 * @description 抽象工厂接口
 * @author Kangshuai Zuo
 * @date 2018/12/3 16:49
 */
public interface Factory {

    public Product createProduct(String productType);

}
