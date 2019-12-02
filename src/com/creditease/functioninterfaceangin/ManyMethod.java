package com.creditease.functioninterfaceangin;
//@FunctionalInterface标记在接口上，“函数式接口”是指仅仅只包含一个抽象方法的接口。
@FunctionalInterface
interface testInterface{

    // 抽象方法
    public void sub();

    // java.lang.Object中的方法不是抽象方法
    public  boolean equals(Object var1);

    // default不是抽象方法
    default public void defaultMethod(){

    }

    // static不是抽象方法
    public static void staticMethod(){}
}

public class ManyMethod {
}
