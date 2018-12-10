package designpatterns.prototype.deepclone;

import java.io.*;

/**
 * @author Kangshuai Zuo
 * @description 学生类
 * @date 2018/12/10 20:18
 */
public class Student implements Serializable,Cloneable {

    private Teacher teacher;

    public Student(Teacher teacher){
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "teacher=" + teacher +
                '}';
    }

    @Override
    public Student clone(){

        try {
            return (Student) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Object deepClone() throws IOException,OptionalDataException,ClassNotFoundException{//将对象写到流里
        ByteArrayOutputStream bo=new ByteArrayOutputStream();
        ObjectOutputStream oo=new ObjectOutputStream(bo);
        oo.writeObject(this);
        ByteArrayInputStream bi=new ByteArrayInputStream(bo.toByteArray());
        ObjectInputStream oi=new ObjectInputStream(bi);
        return(oi.readObject());
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Teacher teacher = new Teacher();
        teacher.setAge(18);
        teacher.setName("A");
        Student student = new Student(teacher);
        System.out.println(student.toString());
        Student student1 = student.clone();
        student1.teacher.setAge(28);
        student1.teacher.setName("V");

        System.out.println(student.teacher.getName()+student.teacher.getAge());


        System.out.println("****************************************");



        Teacher teacher2 = new Teacher();
        teacher2.setAge(18);
        teacher2.setName("A");
        Student student3 = new Student(teacher2);
        System.out.println(student3.toString());
        Student student4 = (Student) student3.deepClone();
        student4.teacher.setAge(28);
        student4.teacher.setName("V");

        System.out.println(student3.teacher.getName()+student3.teacher.getAge());

    }
}
class Teacher implements Serializable{

    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}