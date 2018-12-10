package designpatterns.prototype.test;

import designpatterns.prototype.Manage;
import designpatterns.prototype.core.Prototype;
import designpatterns.prototype.core.PrototypeOne;

/**
 * @description 测试类1
 * @author Kangshuai Zuo
 * @date 2018/12/10 18:04
 */
public class Test {

    public static void main(String[] args) {

        Manage manage = new Manage();

        Prototype prototypeOne = new PrototypeOne("类型I");

        manage.register("one",prototypeOne);

        Prototype prototypeTwo = manage.getPrototype("one");

        prototypeTwo.use("哈哈");
    }

}
