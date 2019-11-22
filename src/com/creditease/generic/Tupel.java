package com.creditease.generic;

public class Tupel<T,H> {
    public final T t;
    public final H h;
    public Tupel(T t,H h){
        this.h=h;
        this.t=t;
    }
    public String rep(){
        return this.h+","+this.t;
    }

    @Override
    public String toString() {
        return "("+rep()+")";
    }
}
