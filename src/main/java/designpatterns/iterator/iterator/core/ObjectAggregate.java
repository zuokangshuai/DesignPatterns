package designpatterns.iterator.iterator.core;

/**
 * @author Kangshuai Zuo
 * @description 实体类容器
 * @date 2018/11/22 11:40
 */
public class ObjectAggregate implements Aggregate{

    /** 初始化容器 */
    public ObjectAggregate(int length){
        this.objects = new Object[length];
        this.last = 0;
    }

    /** 容器存放对象 */
    private Object[] objects;

    /** 记录存放对象的数量 */
    private  int last;


    public void add(Object object){
        this.objects[last] = object;
        last++;
    }

    public int size(){
        return this.last;
    }

    public Object get(int index){
        return objects[index];
    }

    @Override
    public Iterater iterater() {
        return new ObjectAggregateIterator(this);
    }
}
