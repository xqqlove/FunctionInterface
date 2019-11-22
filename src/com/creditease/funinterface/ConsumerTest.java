package com.creditease.funinterface;

import java.util.function.Consumer;

public class ConsumerTest {


    public static void main(String[] args) {
        Consumer c=System.out::println;
        c.accept("helloFunctionInterface");
        Consumer cc=(o)->{o="hello lambada"+o;
            System.out.println(o);};
        cc.accept("qiangqiangxia2@creditease.cn");
        cc.andThen(cc).accept("oo");

    }
}
