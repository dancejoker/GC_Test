package Dispatch.Static_1;

/**
 * 静态分派（重载）
 * 虚拟机在重载的时候，是通过参数的静态类型而不是
 * 实际类型作为判断类型
 * Created by ddp on 2017/10/11.
 */
public class StaticDispatch {
    public void sayHello(Human guy){
        System.out.println("hello,guy!");
    }
    public void sayHello(Man guy){
        System.out.println("hello,man!");
    }
    public void sayHello(Woman guy){
        System.out.println("hello,woman!");
    }

    public static void main(String[] args) {
        Human man = new Man();   //Human为静态类型，Man是实际类型
        Human woman = new Woman();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
    }
}
