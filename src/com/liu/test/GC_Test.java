package com.liu.test;

/**
 * Created by hadoop on 2016/11/24 0024.
 */
public class GC_Test {

    public static void main(String[] args) {
        {
            /**
             * placeholder是否被收回决定于：局部变量表中的Slot是否还存有关于placeholder数组对象的引用
             */
            byte[] placeholder = new byte[64 * 1024 * 1024];   //数据存于局部表量表中
            placeholder = null;   //手动对没有引用局部变量表中数据（placeholder）的变量进行释放
        }
        System.gc();

    }
}
