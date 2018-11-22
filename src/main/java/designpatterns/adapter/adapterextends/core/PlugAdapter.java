package designpatterns.adapter.adapterextends.core;

/**
 * @description 插头转换器
 * @author Kangshuai Zuo
 * @date 2018/11/22 17:22
 */
public class PlugAdapter extends TwoPlug implements ThreePlug{

    public PlugAdapter(String plug) {
        super(plug);
    }

    @Override
    public void threePrint() {
        twoPrint();
    }

}
