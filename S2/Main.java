package S2;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Main {
    static Logger LOG;
    static {
        try(FileInputStream ins = new FileInputStream("s2\\log.cfg")){
            LogManager.getLogManager().readConfiguration(ins);
            LOG = Logger.getLogger(Main.class.getName());
        }catch (Exception ignore){
            ignore.printStackTrace();
        }
    }


    public static void main(String[] args) {
        //Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/DEBUG.
        FirstEx();
        //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        SecondEx();
    }


    private static void SecondEx() {
        //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        var ex2 = new Ex2(new int[]{5, 15, 6, 58, 13, 54, 23, 45});
        ex2.sort();
    }


    private static void FirstEx(){
        //Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/DEBUG.
        var ex1 = new Ex1();
        var lst = ex1.getInfoLog();
        ex1.printToConsole(lst);
    }
}
