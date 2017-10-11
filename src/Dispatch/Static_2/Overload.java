package Dispatch.Static_2;

import java.io.Serializable;

/**
 * 重载中的模糊匹配
 * 原因：字面量不需要定义（不需要Human human = new Man()），
 * 所以字面量没有显示的静态类型，而重载中的参数是通过静态类型
 * 来判别，所以他就无法准确的判断
 * Created by ddp on 2017/10/11.
 */
public class Overload {
    public static void sayHello(Object arg){
        System.out.println("hello,Object");
    }
    public static void sayHello(int arg){
        System.out.println("hello int");
    }
    public static void sayHello(long arg){
        System.out.println("hello long");
    }
    public static void sayHello(Character arg){
        System.out.println("hello Character");
    }
    public static void sayHello(char arg){
        System.out.println("hello char");
    }
    public static void sayHello(char... arg){
        System.out.println("hello char...");
    }
    public static void sayHello(Serializable arg){
        System.out.println("hello Serializable");
    }

    public static void main(String[] args) {
        //a除了代表一个字符串，还可以代表数字97(ASCII码)
        //char->int->long->float->double
        //基本类型没有的时候会转换为他的包装类，若没有包装类会找他的接口或者父类，
        //若同时出现了包装类的2个接口，他们的优先级相同，会提示类型模糊，拒绝编译
        sayHello('a');    //当注销掉char类型的函数，会进行模糊匹配
    }
}
