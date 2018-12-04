package designpatterns.factorymethod.core;

/**
 * @description 具体产品B
 * @author Kangshuai Zuo
 * @date 2018/12/3 17:07
 */
public class ProductOrange extends Product{

    private String productType;

    public ProductOrange(String productType){
        this.productType = productType;
    }
    @Override
    void create() {
        System.out.println("我用橘子造了" + productType);
    }
}
