package com.creditease.generic;

class Hasf {
    public static void f() {
        System.out.println("f()");
    }
}

class Manipulator<T extends Hasf> {
    private T obj;

    public Manipulator(T t) {
        obj = t;
    }

    public void manipulate() {
        obj.f();
    }

}

public class Manipulation {
    public static void main(String[] args) {
        Hasf hasf=new Hasf();
        Manipulator<Hasf> manipulator=new Manipulator<>(hasf);
        manipulator.manipulate();
    }

}
