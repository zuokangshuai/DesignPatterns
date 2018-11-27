package designpatterns.templatemethod.test;

import designpatterns.templatemethod.core.AbstractTemplate;
import designpatterns.templatemethod.core.PageBuilder;
import designpatterns.templatemethod.core.TemplateOne;
import designpatterns.templatemethod.core.TemplateTwo;

/**
 * @description 模板方法测试类
 * @author Kangshuai Zuo
 * @date 2018/11/27 8:47
 */
public class Test {

    public static void main(String[] args) {

        // 实现类一
        AbstractTemplate abstractTemplateOne = new TemplateOne();
        System.out.println(abstractTemplateOne.buildHtml());

        // 实现类二
        PageBuilder abstractTemplateTwo = new TemplateTwo();
        System.out.println(abstractTemplateTwo.buildHtml());
    }
}
