package designpatterns.iterator.iterable.core;

import java.util.Iterator;

/**
 * @description 实现Iterable接口的容器
 * @author Kangshuai Zuo
 * @date 2018/11/22 11:18
 */
public class ObjectAggregate implements Iterable{

    private Object[] objects;
    private int last;

    public ObjectAggregate(int length){
        this.objects = new Object[length];
        this.last = 0;
    }

    public void add(Object object){
        this.objects[last] = object;
        this.last++;
    }

    private int size(){
        return last;
    }

    private Object get(int index){
        return objects[index];
    }

    @Override
    public Iterator iterator() {
        return new Tor(this);
    }
    private class Tor implements Iterator{

        Tor(ObjectAggregate objectAggregate){
            this.index = 0;
            this.objectAggregate = objectAggregate;
        }

        private int index;
        private ObjectAggregate objectAggregate;

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

        @Override
        public void remove() {

        }
    }


}
