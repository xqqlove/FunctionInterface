package com.creditease.functioninterfaceangin;
//函数式接口实例的创建有三种方式：1、lambda表达式；2、方法引用；3、构造方法引用。
//  Compose方法：方法接收一个Function类型的参数，返回一个值。这也是一个标准的Function类型的定义。在compose方法内部也有一个apply方法。在执行compose方法中的apply方法之前，它先执行了before接口的apply方法，也是compose方法的输入参数。然后将before方法执行的返回值作为compose中apply方法的输入参数。实际上是形成了一种链式组合。
//https://blog.csdn.net/qq_36372507/article/details/78757811
//       andThen方法：该方法与compose方法很类似。不同之处在于，andThen是先执行自身的apply方法，将apply的返回值作为after接口的输入值。相对于compose方法，只是方向的不同

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface FunctionInterfaceTest {
    String getInfo(String input);
}

public class TestMain {
    public static void main(String[] args) {
        FunctionInterfaceTest functionInterfaceTest = x -> x + 1;
        FunctionInterfaceTest functionInterfaceTest1 = TestMain::getInstance;
        FunctionInterfaceTest functionInterfaceTest2 = TestMain::getMessage;
        String str1 = joinStr("你好", functionInterfaceTest1);
        String str2 = joinStr("您好", functionInterfaceTest2);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = joinStr("哈喽", item -> item + "!world");
        String str4 = joinStr("koukou", item -> item + "吃了么世界");
        System.out.println(str3);
        System.out.println(str4);

        System.out.println("=================================================");
        Function<String, String> function1 = item -> item + "吃了么";
        Consumer<String> consumer = item -> System.out.println(item);
        Predicate<String> predicate = item -> "".equals(item);
        Supplier<String> supplier = () -> new String("阴阳");

        List<String> list = Arrays.asList("zhanfli ", "xxx", "langlang", "xiaOMI", "hhhh");
        list.stream().map(value -> value + 1).filter(value -> value.length() > 4).forEach(value -> System.out.println(value));

        System.out.println("===================================================");
        String str11 = getLengt1("hello", value -> "hello 的长度" + value, value -> value.length());
        System.out.println(str11);
        System.out.println("===================================================");
        String str12 = getLength2("hello", value -> value + 1, value -> value + value + "chi");
        System.out.println(str12);
// 将输入参数分别赋给andThen内部的accept方法和after内部的accept方法。After的计算在andThen之后，起到了后置连接的作用。在这里没有compose方法，因为后置连接反过来就是前置连接，所以不需要一个多余的compose方法了。只需要在传递时，交换两个consumer的顺序即可。
        System.out.println("====================++++++++++++++++++++++++++++++");
        noResult(Integer.valueOf(12), value -> {
            int num = value + 12;
            System.out.println(num);
        }, value -> {
            int num = value + 24;
            System.out.println(num);
        });

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        getBoolean("hello" ,value->value.length()>2,value->value.length()>6);
    }

    public static String getInstance(String item) {
        return item + "!世界";
    }

    public static String getMessage(String massage) {
        return "世界，" + massage + "!";
    }

    public static String joinStr(String str, FunctionInterfaceTest functionInterfaceTest) {
        return functionInterfaceTest.getInfo(str);
    }

    public static String getLengt1(String str1, Function<Integer, String> function1, Function<String, Integer> function2) {
        return function1.compose(function2).apply(str1);
    }

    public static String getLength2(String str2, Function<String, String> function1, Function<String, String> function2) {
        return function1.andThen(function2).apply(str2);
    }

    public static void noResult(Integer num, Consumer<Integer> consumer1, Consumer<Integer> consumer2) {
        consumer1.andThen(consumer2).andThen(consumer2).andThen(consumer1).accept(num);
    }
    public static boolean getBoolean(String str1,Predicate<String> predicate1,Predicate<String> predicate2){
        boolean test=predicate1.or(predicate2).test(str1);
        System.out.println(test);

        test=predicate1.and(predicate2).test(str1);
        System.out.println(test);

        test=predicate1.negate().test(str1);
        System.out.println(test);
        return test;
    }
}
