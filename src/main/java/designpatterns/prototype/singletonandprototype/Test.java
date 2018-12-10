package designpatterns.prototype.singletonandprototype;

/**
 * @description 测试单例与克隆接口的冲突
 * @author Kangshuai Zuo
 * @date 2018/12/10 18:19
 */
public class Test {

    public static void main(String[] args) {

        Person person1 = Person.getInstance();
        System.out.println(person1.getName());

        Person person2 = person1.clonePerson();
        person2.setName("YYY");
        System.out.println(person2.getName());

    }

}
