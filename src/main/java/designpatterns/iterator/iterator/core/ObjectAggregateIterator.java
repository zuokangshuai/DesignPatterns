package designpatterns.iterator.iterator.core;

/**
 * @description 容器迭代器实现
 * @author Kangshuai Zuo
 * @date 2018/11/22 11:48
 */
public class ObjectAggregateIterator implements Iterater{

    /**  需要迭代的对象 */
    private ObjectAggregate objectAggregate;

    /** 记录迭代器的位置 */
    private int index;

    public ObjectAggregateIterator(ObjectAggregate objectAggregate){
        this.objectAggregate = objectAggregate;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < objectAggregate.size();
    }

    @Override
    public Object next() {
        Object object = objectAggregate.get(index);
        index++;
        return object;
    }
}
