package designpatterns.facade.core;

/**
 * @description Cpu对象
 * @author Kangshuai Zuo
 * @date 2019/1/4 16:34
 */
public class Cpu implements Control{

    @Override
    public void start() {
        System.out.println("CPU已经开始工作");
    }

    @Override
    public void shutdown() {
        System.out.println("CPU已经停止工作");
    }
}