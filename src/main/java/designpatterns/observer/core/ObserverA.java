package designpatterns.observer.core;

/**
 * @description 观察者A
 * @author Kangshuai Zuo
 * @date 2018/12/20 14:26
 */
public class ObserverA implements Observer {

    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("ObserverA:" + numberGenerator.getNumber());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }
}