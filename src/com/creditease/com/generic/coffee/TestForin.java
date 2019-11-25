package com.creditease.com.generic.coffee;

import java.util.Iterator;

public class TestForin implements Iterable<String> {
    private int size = 3;
    protected String[] ss = ("im am bb").split(" ");

    public TestForin() {
    }

    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int count = 0;

            @Override
            public boolean hasNext() {
                return count < ss.length;
            }

            @Override
            public String next() {
                return ss[count++];
            }
        };
    }

    public static void main(String[] args) {
        for (String s : new TestForin()) {
            System.out.println(s);
        }
    }
}
