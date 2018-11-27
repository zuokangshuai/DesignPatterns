package designpatterns.templatemethod.core;

/**
 * @description 模板方法实现二
 * @author Kangshuai Zuo
 * @date 2018/11/27 8:45
 */
public class TemplateTwo extends AbstractTemplate{

    @Override
    void appendHead(StringBuffer stringBuffer) {
        stringBuffer.append("<head>抽象模板方法</head>");
    }

    @Override
    void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body>在抽象类中定义流程和必要的实现，子类再对抽象方法进行实现</body>");
    }

}
