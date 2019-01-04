package designpatterns.facade.core;

/**
 * @description 磁盘对象
 * @author Kangshuai Zuo
 * @date 2019/1/4 16:38
 */
public class Disk implements Control {
    @Override
    public void start() {
        System.out.println("硬盘已经开始工作");
    }

    @Override
    public void shutdown() {
        System.out.println("硬盘已经停止工作");
    }
}