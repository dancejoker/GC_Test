package Dispatch;

/**
 * Created by ddp on 2017/10/11.
 */
public class StaticDispatch {
    static abstract class Human{
    }
    static class Man extends Human{
    }
    static class Woman extends Human{
    }
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
        Man man = new Man();
        Woman woman = new Woman();
        StaticDispatch staticDispatch = new StaticDispatch();
        staticDispatch.sayHello(man);
        staticDispatch.sayHello(woman);
    }
}
