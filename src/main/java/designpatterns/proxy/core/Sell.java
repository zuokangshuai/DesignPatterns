package designpatterns.proxy.core;

/**
 * @description 卖东西接口
 * @author Kangshuai Zuo
 * @date 2018/12/19 10:23
 */
public interface Sell {

    /**
     * 涨价
     */
    void upPrice(Double price);

    /**
     * 降价
     */
    void subPrice(Double price);

    /**
     * 售价
     * @return 价格
     */
    Double getHousePrice();

    /**
     * 收钱
     */
    void receiptMoney();
}
