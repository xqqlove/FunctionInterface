package com.creditease.generic;

import java.util.function.Supplier;

public class BasicSupplier<T> implements Supplier {
    private Class<T> type;
    public BasicSupplier(Class<T> t){
        this.type=t;
    }
    @Override
    public Object get() {
        try {
            return type.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
    public static <T> Supplier<T> creat(Class<T> type){
        return new BasicSupplier<>(type);
    }
}
