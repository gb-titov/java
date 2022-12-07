package S3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ex1();
    }

    public static void ex1(){
        int[] myArray = new int[] { 9, 4, 7, 1, 8, 3, 5, 2, 6 };
        System.out.println("Исходный массив:\t" + Arrays.toString(myArray));
        Ex1.mergeSortRecursive(myArray, 0, myArray.length - 1);
        System.out.println("Отсортированный массив:\t" + Arrays.toString(myArray));
        
    }
}
