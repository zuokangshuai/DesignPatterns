package designpatterns.prototype.core;
import java.util.HashMap;
import java.util.Map;

/**
 * @description 对象管理类
 * @author Kangshuai Zuo
 * @date 2018/12/10 18:00
 */
public class Manage {

    private Map<String, Prototype> map = new HashMap<String, Prototype>();

    public void register(String name, Prototype prototype){
        map.put(name, prototype);
    }

    public Prototype getPrototype(String name){
        Prototype prototype = map.get(name);
        return prototype.clonePrototype();
    }
}
