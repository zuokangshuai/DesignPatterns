package designpatterns.adapter.adapterdepute.test;


import designpatterns.adapter.adapterdepute.core.PlugAdapter;
import designpatterns.adapter.adapterdepute.core.ThreePlug;

/**
 * @author Kangshuai Zuo
 * @description 测试类
 * @date 2018/11/22 17:49
 */
public class Test {

    public static void main(String[] args) {
        ThreePlug threePlug = new PlugAdapter("三角插头");
        ((PlugAdapter) threePlug).threePrint();
    }
}
