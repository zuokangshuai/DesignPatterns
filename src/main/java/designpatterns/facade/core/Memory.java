package designpatterns.facade.core;

/**
 * @description 内存对象
 * @author Kangshuai Zuo
 * @date 2019/1/4 16:37
 */
public class Memory implements Control{

    @Override
    public void start() {
        System.out.println("内存一开始工作");
    }

    @Override
    public void shutdown() {
        System.out.println("内存已经停止工作");
    }
}