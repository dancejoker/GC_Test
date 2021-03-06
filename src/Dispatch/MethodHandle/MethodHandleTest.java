package Dispatch.MethodHandle;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;

import static java.lang.invoke.MethodHandles.lookup;

/**
 * Created by ddp on 2017/10/12.
 */
public class MethodHandleTest {
    private static MethodHandle getPrintlnMH(Object reveiver) throws NoSuchMethodException, IllegalAccessException {
        /**
         * MethodType：代表"方法类型",包含了方法的返回值（methodType()的第一个参数）和具体参数（methodType()的第二个及以后的参数）
         */
        MethodType mt = MethodType.methodType(void.class, String.class);
        /**
         * lookup()方法来自于MethodHandles.lookup,这句的作用是在指定类中查找符合
         * 给定的方法名称，方法类型，并且符合调用权限的方法句柄
         */
        /**
         * 应为这里调用的是一个虚方法，按照java语言的规则，方法第一个参数是隐式的
         * 代表该方法的接受者，也即是this指向的对象，这个参数以前放在参数列表中进行传递的，
         * 而现在提供了bindTo()方法来完成这件事
         */
        return lookup().findVirtual(reveiver.getClass(),"println",mt).bindTo(reveiver);
    }

    public static void main(String[] args) throws Throwable {
        Object object = System.currentTimeMillis() % 2 == 0 ? System.out : new ClassA();
        getPrintlnMH(object).invokeExact("hello invoke!");
    }
}
