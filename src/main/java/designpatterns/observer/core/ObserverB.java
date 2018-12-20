package designpatterns.observer.core;

/**
 * @author Kangshuai Zuo
 * @description 观察者B
 * @date 2018/12/20 14:40
 */
public class ObserverB implements Observer{

    private int i;
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.print("ObserverB:");
        for(i=0 ;i<numberGenerator.getNumber(); ++i){
            System.out.print("*");
        }
        System.out.println("("+numberGenerator.getNumber()+"）");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}