package com.creditease.generic;

public class GenericHolder<T> {
    private  T t;
    public GenericHolder(){}
    public void set(T t){
        this.t=t;
    }
    public T get(){
        return this.t;
    }

    public static void main(String[] args) {
        GenericHolder<String> genericHolder=new GenericHolder<>();
        genericHolder.set("qiangqiang");
        System.out.println(genericHolder.get());
    }
}
