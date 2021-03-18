package lesson2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        MyArrayList<Integer> mal = new MyArrayList<>(100000);
        for (int i = 0; i < 100000; i++) {
            mal.add(r.nextInt(100000));
        }
        long startTime = System.currentTimeMillis();

        mal.selectionSort();//Operation took (selectionSort)13490 milliseconds
        System.out.println("Operation took (selectionSort)" + (System.currentTimeMillis() - startTime) + " milliseconds");
        mal.insertionSort();//Operation took (insertionSort)13497 milliseconds
        System.out.println("Operation took (insertionSort)" + (System.currentTimeMillis() - startTime) + " milliseconds");
        mal.bubbleSort(); // Operation took (bubbleSort)27568 milliseconds
        System.out.println("Operation took (bubbleSort)" + (System.currentTimeMillis() - startTime) + " milliseconds");


    }
}
