package com.creditease.streamcodingangin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
//https://blog.csdn.net/IO_Field/article/details/54971761
public class TestStreamOperator {
    public static void main(String[] args) {
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::print);

        Stream stream = Stream.of("a", "b", "c");
        stream.forEach(System.out::print);
        String[] strArray = new String[]{"a", "b", "c"};
        stream = Stream.of(strArray);
        stream.forEach(System.out::println);
        stream= Arrays.stream(strArray);

        List<String> list=Arrays.asList(strArray);
        stream=list.stream();
        stream.forEach(System.out::println);
        System.out.println("==========================================");
        Stream stream1=Stream.of("a","qiangqiang","xia","chwen");
        List<String> list2=Arrays.asList("a","qiangqiang","xia","chwen");
        List<String> out=list2.stream().map(String::toUpperCase).collect(Collectors.toList());
        for(String s:out){
            System.out.println(s);
        }
        List<Integer> nums=Arrays.asList(1,2,3,4);
        List<Integer> squaue=nums.stream().map(n->n*n).collect(Collectors.toList());
        for (Integer i:squaue){
            System.out.println(i);
        }
        Stream<List<Integer>> inputStream=Stream.of(Arrays.asList(1),
                Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6));
        Stream<Integer> output=inputStream.flatMap(x->x.stream());
        System.out.println(output.toArray());

        Integer[] sixNUms={1,2,3,4,5};
        Integer[] even=Stream.of(sixNUms).filter(n->n%2==0).toArray(Integer[]::new);
        for (Integer i:even){
            System.out.println(i);
        }

        List number=Arrays.asList(1,2,3,4,5,6,7,8,9);
        number.parallelStream().forEachOrdered(System.out::print);
    }
}

