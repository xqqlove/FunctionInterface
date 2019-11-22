package com.creditease.funinterface;


import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {
        Function<Integer,Integer> f=(x)->x*(x-1);
        Function<String,String> g=(y)->y.toUpperCase();
        Function<Integer,Integer> h=(x)->x*x+1;
        System.out.println(f.apply(5));
        System.out.println(g.apply("qiangqiangxia2@creditease.cn"));
        System.out.println(f.compose(h).apply(1));
        System.out.println(f.andThen(h).apply(1));
    }
}
