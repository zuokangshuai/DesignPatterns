package designpatterns.iterator.iterator.test;

import designpatterns.iterator.iterator.core.Iterater;
import designpatterns.iterator.iterator.core.ObjectAggregate;
import org.junit.jupiter.api.Test;

/**
 * @description 测试Iterable类
 * @author Kangshuai Zuo
 * @date 2018/11/22 11:24
 */
class TestIterable {

    @Test
    void test1(){

        ObjectAggregate objectAggregate = new ObjectAggregate(5);

        Person p1 = new Person("AA");
        Person p2 = new Person("BB");
        Person p3 = new Person("CC");
        Person p4 = new Person("DD");
        Person p5 = new Person("EE");

        objectAggregate.add(p1);
        objectAggregate.add(p2);
        objectAggregate.add(p3);
        objectAggregate.add(p4);
        objectAggregate.add(p5);

        Iterater it = objectAggregate.iterater();
        while (it.hasNext()){
            Person person = (Person) it.next();
            System.out.println(person.getName());
        }

    }

}
