package designpatterns.observer.core;

import java.util.Random;

/**
 * @description 生成随机数字
 * @author Kangshuai Zuo
 * @date 2018/12/20 14:20
 */
public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        int i;
        for(i =0; i < 20; ++i){
            number = random.nextInt(20);
            this.notifyObserver();
        }
    }
}