package designpatterns.adapter.adapterdepute.test;


import designpatterns.adapter.adapterdepute.core.PlugAdapter;

/**
 * @description 测试类
 * @author Kangshuai Zuo
 * @date 2018/11/22 17:49
 */
public class Test {

    public static void main(String[] args) {
        PlugAdapter threePlug = new PlugAdapter("三角插头");
        threePlug.threePrint();
    }
}
