package designpatterns.prototype.singletonandprototype;

/**
 * @description 实体类
 * @author Kangshuai Zuo
 * @date 2018/12/10 18:13
 */
public class Person implements Cloneable{

    private String name;

    private static Person person = new Person();

    private Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    public static Person getInstance(){
        person.setName("XXX");
        return person;
    }

    public Person clonePerson(){
        try {
            return (Person) person.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
