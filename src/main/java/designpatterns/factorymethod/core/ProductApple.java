package designpatterns.factorymethod.core;

/**
 * @description 具体的产品
 * @author Kangshuai Zuo
 * @date 2018/12/3 17:03
 */
public class ProductApple extends Product {

    private String productType;

    public ProductApple(String productType){
        this.productType = productType;
    }

    @Override
    void create() {
        System.out.println("我用苹果造了" + productType);
    }

}
