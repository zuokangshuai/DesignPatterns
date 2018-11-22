package designpatterns.adapter.adapterextends.test;

import designpatterns.adapter.adapterextends.core.PlugAdapter;
import designpatterns.adapter.adapterextends.core.ThreePlug;

/**
 * @author Kangshuai Zuo
 * @description 测试类
 * @date 2018/11/22 17:49
 */
public class Test {

    public static void main(String[] args) {
        ThreePlug threePlug = new PlugAdapter("三角插头");
        threePlug.threePrint();
    }
}
