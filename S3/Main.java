package S3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ex1();

        ex2();

        ex3();
    }

    public static void ex1(){
        System.out.println("Реализовать алгоритм сортировки слиянием");
        int[] myArray = new int[] { 9, 4, 7, 1, 8, 3, 5, 2, 6 };
        System.out.println("Исходный массив:\t" + Arrays.toString(myArray));
        Ex1.mergeSortRecursive(myArray, 0, myArray.length - 1);
        System.out.println("Отсортированный массив:\t" + Arrays.toString(myArray));
        System.out.println();
    }

    public static void ex2(){
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него четные числа");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("Исходный список:\t" + list);
        Ex2.RemoveEvenNums(list);
        System.out.println("Список без четных чисел:\t" + list);  
        System.out.println(); 
    }

    public static void ex3(){
        System.out.println("Задан целочисленный список ArrayList.");
        System.out.println("Найти минимальное, максимальное и среднее из этого списка.");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        System.out.println("Исходный список:\t" + list);
        System.out.println("MAX: " + Ex3.max(list));  
        System.out.println("MIN: " + Ex3.min(list));  
        System.out.println("AVG: " + Ex3.average(list));  
        System.out.println();
    }
}
