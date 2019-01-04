package designpatterns.facade.core;

/**
 * @description 控制开关接口
 * @author Kangshuai Zuo
 * @date 2019/1/4 16:33
 */
public interface Control {

    /**
     * 开启功能
     */
    void start();

    /**
     * 关闭功能
     */
    void shutdown();


}