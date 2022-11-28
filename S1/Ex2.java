package S1;

import java.util.ArrayList;
import java.util.List;

public class Ex2 {
    
    private Boolean isPrime(int num)
    {
        for (int i = 2; i < num; i++)
        {
            if (num % i == 0)
                return false;
        }
        return true;
    }


    public List<Integer> getPrimes(int n){
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(isPrime(i))
                list.add(i);
        }
        return list;
    }


}
