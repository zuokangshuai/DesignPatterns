package designpatterns.prototype.core;

/**
 * @description 原型实现
 * @author Kangshuai Zuo
 * @date 2018/12/10 17:54
 */
public class PrototypeOne implements Prototype{

    private String re;

    public PrototypeOne(String re){
        this.re = re;
    }

    @Override
    public void use(String message) {
        System.out.println(this.re+message);
    }

    @Override
    public Prototype clonePrototype() {
        Prototype prototype1 = null;
        try{
            System.out.println("克隆");
            prototype1 = (Prototype) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("不支持克隆该对象");
        }
        return prototype1;
    }
}
