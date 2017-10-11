package Dispatch.Dynamic;

/**
 * Created by ddp on 2017/10/11.
 */
public class DynamicDispatch {
    public static void main(String[] args) {
        Human man = new Man();
        Human woman = new Woman();
        man.sayHello();
        woman.sayHello();
        man = new Woman();
        man.sayHello();
    }
}
