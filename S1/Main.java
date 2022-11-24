package HW.S1;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        firstEx();
        // Вывести все простые числа от 1 до 1000
        SecondEx();

        // Реализовать простой калькулятор
        ThirdEx();
    }


    private static void firstEx(){
        System.out.println("Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)");
        int num = readDataAsInt("Введите число: ");
        Ex1 ex1 = new Ex1();
        System.out.println("N-ое треугольного числа равно: " + ex1.sumTrianlgeNum(num));
        System.out.println("Факториал числа равен: " + ex1.factorial(num));
        System.out.println();
    }

    private static void SecondEx(){
        Ex2 ex2 = new Ex2();
        List<Integer> lst = ex2.getPrimes(1000);
        System.out.println("Вывести все простые числа от 1 до 1000");
        System.out.println(Arrays.toString(lst.toArray()));
        System.out.println();
    }

    private static void ThirdEx(){
        System.out.println("Реализовать простой калькулятор");
        int first = readDataAsInt("Введите первый операнд(целое число): ");
        int second = readDataAsInt("Введите второй операнд(целое число): ");
        char operator = readDataAsChar("Введите оператор(+,-,*,/)") ;
        var result = Ex3.calc(first, second, operator);
        System.out.printf("%s %s %s = %s",first , operator, second, result);
    }

    

    private static int readDataAsInt(String msg){
        System.out.print(msg);
        Scanner input = new Scanner(System.in);
        int name = input.nextInt();
        //input.close();
        return name;
    }
    private static char readDataAsChar(String msg){
        System.out.print(msg);
        Scanner input = new Scanner(System.in);
        var name = input.next().charAt(0);
        //input.close();
        return name;
    }
}
