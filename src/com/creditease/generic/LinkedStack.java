package com.creditease.generic;

import java.util.function.Supplier;

public class LinkedStack<T> {
    private static class Node<U>{
        U item;
        Node<U> next;
        public Node(){}
        public Node(U item,Node<U> next){
            this.item=item;
            this.next=next;
        }
        boolean end(){
            return item==null&&next==null;
        }
    }
    private Node<T> top=new Node<>();
    public void push(T item){
        top=new Node<>(item,top);
    }
    public T pop(){
        T result=top.item;
        if(!top.end()){
            top=top.next;
        }
        return result;
    }

    public static void main(String[] args) {
        LinkedStack<String> linkedStack=new LinkedStack<>();
        for (String s:"i am a hero please tell me bb!".split(" ")){
            linkedStack.push(s);
        }
        String s;
        while((s=linkedStack.pop())!=null){
            System.out.println(s);
        }
    }
}
