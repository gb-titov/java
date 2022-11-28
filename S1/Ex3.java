package S1;

public class Ex3 {
    
    public static int calc(int first, int second, char operation){
        switch (operation) {
            case '+':
                return addition(first, second);
            case '-':
                return subtraction(first, second);
            case '*':
                return multiplication(first, second);
            case '/':
                return division(first, second);
        }

        throw new ArithmeticException("Can't do this operation");
    }

    private static int addition(int first, int second){
        return first + second;
    }

    private static int multiplication(int first, int second){
        return first * second;
    }

    private static int subtraction(int first, int second){
        return first - second;
    }

    private static int division(int first, int second){
        return first / second;
    }


}
