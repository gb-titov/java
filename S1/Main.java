package HW.S1;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        // Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
        firstEx();


    }


    private static void firstEx(){
        int num = readDataAsInt("Введите число: ");
        Ex1 ex1 = new Ex1();
        System.out.println("N-ое треугольного числа равно: " + ex1.sumTrianlgeNum(num));
        System.out.println("Факториал числа равен: " + ex1.factorial(num));
    }

    private static int readDataAsInt(String msg){
        System.out.print(msg);
        Scanner in = new Scanner(System.in);
        int name = in.nextInt();
        in.close();
        return name;
    }
}
