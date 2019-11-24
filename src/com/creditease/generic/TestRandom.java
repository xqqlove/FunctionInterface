package com.creditease.generic;

import java.util.Random;

public class TestRandom {
    public static void main(String[] args) {
        int sum=0;
        Random rand=new Random();
        System.out.println(rand);
        for(int i=0;i<10;i++){
            int a=rand.nextInt(10);
            System.out.println(a);
        }
    }
}
