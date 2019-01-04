package designpatterns.facade.test;

import designpatterns.facade.core.Computer;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2019/1/4 16:45
 */
public class Test {

    public static void main(String[] args) {

        Computer computer = new Computer();
        computer.start();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        computer.shutdown();

    }

}