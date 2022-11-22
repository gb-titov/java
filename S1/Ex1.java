package HW.S1;

public class Ex1 {

    public Integer sumTrianlgeNum(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum+=i;
        
        return sum;
    }

    public int factorial(int n){
        int multi = 1;
        for (int i = 1; i <= n; i++)
            multi *= i;
        
        return multi;
    }
}
