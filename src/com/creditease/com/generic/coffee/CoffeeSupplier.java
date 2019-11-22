package com.creditease.com.generic.coffee;

import java.util.*;
import java.util.Random;
import java.util.function.Supplier;

public class CoffeeSupplier implements Supplier<Coffee> ,Iterable<Coffee> {

    private Class<?>[] type={Latte.class,Mocha.class,Cappuccino.class,Americano.class,Breve.class};
    private static Random rand=new Random(47);
    public CoffeeSupplier(){}
    private int size=0;
    public CoffeeSupplier(int sz){this.size=sz;}

    @Override
    public Coffee get() {
      return null;
    }



    class CofferIterator implements Iterator<Coffee>{

        int count = size;

        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Coffee next() {
            return null;
        }

        @Override
        public void remove() {

        }
    }
    @Override
    public Iterator<Coffee> iterator() {
        return new CofferIterator();
    }
    public static void main(String[] args) {

    }
}
