package S3;

import java.util.ArrayList;
//Пусть дан произвольный список целых чисел, удалить из него четные числа
public class Ex2 {
    public static ArrayList<Integer> RemoveEvenNums(ArrayList<Integer> list){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 == 0)
                list.remove(i);
        }
        return list;
    }
}
