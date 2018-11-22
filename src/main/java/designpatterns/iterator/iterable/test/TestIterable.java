package designpatterns.iterator.iterable.test;

import designpatterns.iterator.iterable.core.ObjectAggregate;
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

        Person p1 = new Person("A");
        Person p2 = new Person("B");
        Person p3 = new Person("C");
        Person p4 = new Person("D");
        Person p5 = new Person("E");

        objectAggregate.add(p1);
        objectAggregate.add(p2);
        objectAggregate.add(p3);
        objectAggregate.add(p4);
        objectAggregate.add(p5);

        for (Object anObjectAggregate : objectAggregate) {
            Person person = (Person) anObjectAggregate;
            System.out.println(person.getName());
        }

    }

}
