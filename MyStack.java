package lesson3;

import java.util.EmptyStackException;
import java.util.Queue;

public class MyStack<T> {
    private T[] list;
    private int size;
    private int capacity;
    private final int DEFAULT_CAPACITY = 10;


    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
        this.capacity = capacity;
        list = (T[]) new Object[capacity];
    }
// 1. Создать программу, которая переворачивает вводимые строки (читает справа налево).
    public String reverse(String message) {
        MyStack stack = new MyStack(message.length());
        byte[] bytes = message.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            stack.push(bytes[i]);
        }
        for (int i = 0; i < bytes.length; i++) {
            bytes[i] = (byte) stack.pop();
        }

        return new String(bytes);
    }

    public MyStack() {
        this.capacity = DEFAULT_CAPACITY;
        list = (T[]) new Object[capacity];
    }

    public void push(T item) {
        if (isFull()) {
            //реализовать расширение массива
            throw new StackOverflowError("Стек заполнен");
        }
        list[size]= item;
        size++;
    }

    public T pop(){
        T temp = peek();
        size--;
        list[size]= null;
        return temp;
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list[size-1];
    }

    public boolean isFull() {
        return size == list.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    private void reCapacity(int newCapacity){
        T[] tempArr = (T[]) new Object[newCapacity];
        System.arraycopy(list, 0, tempArr, 0, size);
        list = tempArr;
    }


}
