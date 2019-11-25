package com.creditease.generic;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class GenericVarargs {
    @SafeVarargs
    public static <T> List<T> makeList(T ... args){
        List<T> result=new ArrayList<>();
        for(T t:args){
            result.add(t);
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> l=makeList("a","b","c");
        System.out.println(l);
        for (String s:l){
            System.out.println(s);
        }
    }
}
