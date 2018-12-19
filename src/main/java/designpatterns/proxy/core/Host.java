package designpatterns.proxy.core;
/**
 * @description 主人类
 * @author Kangshuai Zuo
 * @date 2018/12/19 10:22
 */
public class Host extends Person implements Sell{

    /** 房子价格*/
    private Double price;

    public Host(){
        this.price = 70000D;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public void upPrice(Double price) {
        this.price += price;
        System.out.println("房子涨价" + price);
    }

    @Override
    public void subPrice(Double price) {
        this.price -= price;
        System.out.println("房子降价" + price);
    }

    @Override
    public Double getHousePrice() {
        return this.price;
    }

    @Override
    public void receiptMoney() {
        System.out.println("主人收到房子付款");
    }
}
