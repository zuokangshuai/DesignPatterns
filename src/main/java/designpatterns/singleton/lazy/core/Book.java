package designpatterns.singleton.lazy.core;

/**
 * @description 实体类 书（懒汉模式）
 * @author Kangshuai Zuo
 * @date 2018/12/4 13:35
 */
public class Book {

    /*** 私有化构造器*/
    private Book(){}

    private static Book book;

    /** 获取对象 */
    public static Book getInstance(){

        synchronized (Book.class){
            if (book != null){
               return book;
            }
            book = new Book();
            return book;
        }
    }

}
