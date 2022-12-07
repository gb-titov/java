package S3;

import java.util.ArrayList;

public class Ex3 {
    public static Integer max(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i : list){
            if(i > max)
                max = i;
        }
        return max;
    }

    public static Integer min(ArrayList<Integer> list){
        int min = Integer.MAX_VALUE;
        for(int i : list){
            if(i < min)
                min = i;
        }
        return min;
    }

    public static double average(ArrayList<Integer> list){
        double sum = 0;
        for(int i : list){
            sum += i;
        }
        return sum / list.size();
    }
}
