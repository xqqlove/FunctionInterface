package com.creditease.streamcoding;

import java.util.Random;

public class Randoms {
    public static void main(String[] args) {
        new Random(4).ints(5,20)
                .distinct().limit(7).sorted().forEach(System.out::println);
    }
}
