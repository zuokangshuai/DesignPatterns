package designpatterns.proxy.test;

import designpatterns.proxy.core.Agency;
import designpatterns.proxy.core.Host;
import designpatterns.proxy.core.Person;

/**
 * @description 测试
 * @author Kangshuai Zuo
 * @date 2018/12/19 10:47
 */
public class Test {

    public static void main(String[] args) {
        Person host = new Host();
        Person agency = new Agency((Host) host);
        System.out.println("房主手里房子的卖价"+(((Host) host).getHousePrice()));
        System.out.println("中介手里房子的卖价"+((Agency) agency).getHousePrice());
        System.out.println("*********** 中介操纵房价 ************");
        ((Agency) agency).upPrice(100D);
        ((Agency) agency).subPrice(50D);
        System.out.println("中介手里房子的卖价"+((Agency) agency).getPrice());

        System.out.println("************* 主人变更房价 ************");
        ((Host) host).setPrice(100000D);
        System.out.println("房主手里房子的卖价"+(((Host) host).getHousePrice()));
        System.out.println("中介手里房子的卖价"+((Agency) agency).getHousePrice());
        ((Host) host).upPrice(10000D);
        ((Host) host).subPrice(20000D);
        System.out.println("中介手里房子的卖价"+((Agency) agency).getHousePrice());
        System.out.println("************ 收款 *************");
        ((Agency) agency).receiptMoney();

    }

}