package com.creditease.generic;

public class GenericMethod {
    public <T> void f(T t){
        System.out.println(t.getClass().getName());
    }

    public static void main(String[] args) {
        GenericMethod genericMethod=new GenericMethod();
        genericMethod.f(1);
        genericMethod.f(1.1);
        genericMethod.f("helloworld");
        genericMethod.f(genericMethod);
    }
}
