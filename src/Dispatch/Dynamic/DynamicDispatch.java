package Dispatch.Dynamic;

/**
 * 动态分派（重写）
 * invokevirtual运行解析过程:
 * 找到操作数栈顶的第一个元素所指的对象的实际类型，记作C
 * 如果在类型C中找到与常量中的描述符和简单名称都相符的方法，进行访问权限检验，
 * 通过则返回这个方法的直接引用，如果未通过则报IllegalAccessError
 * 如果没有找到相符的方法，则按照其继承关系由下到上进行搜索验证，
 * 若始终没有找到，则报出AbstractMethodError异常
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
