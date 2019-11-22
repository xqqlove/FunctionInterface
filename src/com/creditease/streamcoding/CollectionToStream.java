package com.creditease.streamcoding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Bubble{
    private int index;
    Bubble(int i){
        this.index=i;
    }
}

public class CollectionToStream {
    public static void main(String[] args) {
        List<Bubble> bubbles= Arrays.asList(new Bubble(1),new Bubble(2),new Bubble(3));
        bubbles.stream().forEach(System.out::println);
        Set<String> w=new HashSet<>(Arrays.asList(("It's a wonderful day for pie!").split(" ")));
        w.stream().map(x->x+"||").forEach(System.out::print);
    }
}
