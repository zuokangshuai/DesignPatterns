package designpatterns.observer.test;

import designpatterns.observer.core.*;

/**
 * @author Kangshuai Zuo
 * @description 测试类
 * @date 2018/12/20 14:28
 */
public class Test {

    public static void main(String[] args) {
        Observer observerA = new ObserverA();
        Observer observerB = new ObserverB();
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        numberGenerator.addObserver(observerA);
        numberGenerator.addObserver(observerB);
        numberGenerator.execute();
    }


}