package S4;

import java.util.LinkedList;

public class Ex2<T> {
    private LinkedList<T> list;

    public Ex2() {
        list = new LinkedList<T>();
    }

    public void enqueue(T item){
        list.add(item);
    }

    public T first(){
        if(list.size() == 0)
            return null;
        return list.get(0);
    }

    public T dequeue(){
        if(list.size() == 0)
            return null;
        T item = list.get(0);
        list.remove(0);
        return item;
    }

    public void printQueueToConsole(){
        System.out.println(list);
    }
}
