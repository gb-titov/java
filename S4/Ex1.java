package S4;

import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Ex1<T>{
    
    public LinkedList<T> reverse(LinkedList<T> list){
        var newList = new LinkedList<T>();

        for (int i = list.size() - 1; i >= 0; i--){
            newList.add(list.get(i));
        }

        return newList;
    }
}
