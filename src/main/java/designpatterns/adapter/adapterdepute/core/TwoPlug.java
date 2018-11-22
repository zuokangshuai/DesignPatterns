package designpatterns.adapter.adapterdepute.core;

/**
 * @description 两脚插头
 * @author Kangshuai Zuo
 * @date 2018/11/22 17:19
 */
public class TwoPlug {

    private String plug;

    public TwoPlug(String plug){
        this.plug = plug;
    }

    void twoPrint(){
        System.out.println(plug + "----->两脚插头");
    }

}
