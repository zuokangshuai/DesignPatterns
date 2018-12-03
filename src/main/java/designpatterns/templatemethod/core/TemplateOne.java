package designpatterns.templatemethod.core;

/**
 * @description 模板方法实现一
 * @author Kangshuai Zuo
 * @date 2018/11/27 8:45
 */
public class TemplateOne extends AbstractTemplate{

    @Override
    void appendHead(StringBuffer stringBuffer) {
        stringBuffer.append("<head>听党指挥-能打胜仗</head>");
    }

    @Override
    void appendBody(StringBuffer stringBuffer) {
        stringBuffer.append("<body>毛主席万岁</body>");
    }
}
