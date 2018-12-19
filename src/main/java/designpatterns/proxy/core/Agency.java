package designpatterns.proxy.core;

/**
 * @description 中介
 * @author Kangshuai Zuo
 * @date 2018/12/19 10:28
 */
public class Agency extends Person implements Sell{

    /** 持有房子主人对象*/
    private Host host;

    public Double getPrice() {
        return price;
    }

    /** 房子价格 */
    private Double price;

    public Agency(Host host){
        this.host = host;
        this.price = this.getHousePrice();
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
        this.price = host.getHousePrice()+ 1000d;
        return price;
    }

    @Override
    public void receiptMoney() {
        host.receiptMoney();
    }

}