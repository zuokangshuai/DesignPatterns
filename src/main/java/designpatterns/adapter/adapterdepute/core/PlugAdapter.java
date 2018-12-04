package designpatterns.adapter.adapterdepute.core;

/**
 * @description 插头转换器
 * @author Kangshuai Zuo
 * @date 2018/11/22 17:56
 */
public class PlugAdapter extends ThreePlug{

    private TwoPlug twoPlug;

    public PlugAdapter(String plug){
        this.twoPlug = new TwoPlug(plug);
    }

    @Override
    public void threePrint(){
        twoPlug.twoPrint();
    }


}
