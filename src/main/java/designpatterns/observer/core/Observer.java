package designpatterns.observer.core;

/**
 * @description 观察者
 * @author Kangshuai Zuo
 * @date 2018/12/20 14:06
 */
public interface Observer {

    /**
     * 变化通知方法
     */
    void update(NumberGenerator numberGenerator);

}