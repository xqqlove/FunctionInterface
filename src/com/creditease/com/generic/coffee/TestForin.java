package com.creditease.com.generic.coffee;

import java.util.Iterator;

public class TestForin {
    private int size=3;
    protected String[] ss=("im am bb").split(" ");
    public TestForin(){}
    class TestForinIterator implements Iterator{
        private int count=0;
        @Override
        public boolean hasNext() {
            return count<size;
        }

        @Override
        public String next() {
            return TestForin.this.ss[count++];
        }
    }
    public Iterator iterator(){return  new TestForinIterator();}

    public static void main(String[] args) {
     for (Object s:new TestForin()){
         System.out.println(s);
     }
}
