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
        
        FirstEx();
    }


    private static void FirstEx(){
        //Распарсить файл с логами из заданий, выполненных на семинаре, найти записи уровня INFO/DEBUG.
        var ex1 = new Ex1();
        var lst = ex1.GetInfoLog();
        ex1.printToConsole(lst);
    }
}
