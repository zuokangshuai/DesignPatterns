package designpatterns.singleton.hungry.core;

/**
 * @description 实体类 书(饿汉模式)
 * @author Kangshuai Zuo
 * @date 2018/12/4 11:01
 */
public class Book {

    /** 私有默认构造器 */
    private Book(){}

    /*** 加载类时就创建对象 */
    private static Book book = new Book();

    /** 获取对象  */
    public static Book getInstance(){
        return  book;
    }


}
