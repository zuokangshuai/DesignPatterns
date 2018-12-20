package designpatterns.observer.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @description 数字生成类
 * @author Kangshuai Zuo
 * @date 2018/12/20 14:09
 */
public abstract class NumberGenerator {

    /** 观察者容器 */
    private List<Observer> observerList = new ArrayList<Observer>();

    /**
     * 增加观察者
     * @param observer 观察者
     */
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }

    /**
     * 删除观察者
     * @param observer 观察者
     */
    public void deleteObserver(Observer observer) {
        observerList.remove(observer);
    }

    /**
     * 通知观察者
     */
    void notifyObserver(){
        for(Observer observer : observerList){
            observer.update(this);
        }
    }

    /**
     * 获取随机数字
     * @return int
     */
    public abstract int getNumber();

    /**
     * 生成随机数字
     */
    public abstract void execute();

}