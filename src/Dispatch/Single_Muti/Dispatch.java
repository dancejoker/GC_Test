package Dispatch.Single_Muti;

/**
 * p256
 * 方法的宗量：方法的接受者和方法的参数的统称
 * 根据分派基于多少种宗量，可以将分派分为单分派和多分派
 * 单分派和多分派的事例
 * Java语言属于静态多分派，动态单分派的语言
 * Created by ddp on 2017/10/12.
 */
public class Dispatch {
    public static void main(String[] args) {
        Father father = new Father();
        Father son = new Son();
        father.hardChoice(new _360());
        son.hardChoice(new QQ());
    }
}
