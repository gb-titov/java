package S5;

import java.util.HashMap;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(CheckBracks("([a + b)*[c-d]"));
        System.out.println(CheckBracks("a + )b)*[c-d]"));
    }



    public static boolean CheckBracks(String data){
        var brackets = new HashMap<Character, Character>();
        brackets.put('(',')');
        brackets.put('[',']');

        var st = new Stack<Character>();

        var chars = data.toCharArray();

        for(Character c : chars){
            if(brackets.containsKey(c))
                st.push(c);
            else if(brackets.containsValue(c)){
                if(st.empty())
                    return false;
                
                var close = brackets.get(st.peek());
                
                if(close.equals(c))
                    st.pop();
                else
                    return false;
            }
        } 
        return st.empty();
    }
}
