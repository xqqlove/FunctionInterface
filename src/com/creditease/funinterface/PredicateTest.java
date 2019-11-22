package com.creditease.funinterface;




import java.util.function.Predicate;

public class PredicateTest {
    public static void main(String[] args) {
        Predicate<String> p=o->o.equals("test");
        Predicate<String> g=o->o.startsWith("t");
//        Assert.check();
    }
}
