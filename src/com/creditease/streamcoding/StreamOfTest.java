package com.creditease.streamcoding;

import org.w3c.dom.ls.LSOutput;

import java.util.stream.Stream;

public class StreamOfTest {
    public static void main(String[] args) {
        Stream.of("qq","c","xx","ff").forEach(System.out::print);
    }
}
