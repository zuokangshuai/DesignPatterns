package designpatterns.facade.core;

/**
 * @author Kangshuai Zuo
 * @description 电脑对象
 * @date 2019/1/4 16:40
 */
public class Computer implements Control {

    private Cpu cpu;
    private Disk disk;
    private Memory memory;

    public Computer(){
        cpu = new Cpu();
        disk = new Disk();
        memory = new Memory();
    }

    @Override
    public void start() {
        System.out.println("**************  电脑开始启动  *******************");
        cpu.start();
        disk.start();
        memory.start();
        System.out.println("**************  电脑启动完成  *******************");
    }

    @Override
    public void shutdown() {
        System.out.println("**************  电脑正在关机  *******************");
        cpu.shutdown();
        disk.shutdown();
        memory.shutdown();
        System.out.println("**************  电脑关机完成  *******************");
    }
}