package designpatterns.iterator.iterable.test;

/**
 * @description 测试实体类
 * @author Kangshuai Zuo
 * @date 2018/11/22 11:23
 */
public class Person {

    public Person(String name){
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }
}
