package designpatterns.prototype.core;

/**
 * @author Kangshuai Zuo
 * @description 原型接口
 * @date 2018/12/10 17:47
 */
public interface Prototype extends Cloneable{

    public void use(String message);

    public Prototype clonePrototype();

}
