package com.creditease.streamcodingangin;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class TypeOfThis{
    private String name;
    private Integer age;
    public TypeOfThis(){}
    public TypeOfThis(String name,Integer age){
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TypeOfThis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestSort {
    public static void main(String[] args) {
        List<TypeOfThis> list=new ArrayList<>();
        for (int i=10;i>=0;i--){
            list.add(new TypeOfThis("xq"+i,i));
        }
        Collections.sort(list, new Comparator<TypeOfThis>() {
            @Override
            public int compare(TypeOfThis o1, TypeOfThis o2) {
                return o1.getAge().compareTo(o2.getAge());
            }
        });
        System.out.println(list.toString());
    }


}
