package S2;

import java.util.logging.Logger;

public class Ex2 {
    private int[] array;
    private int elemCount;
    private static final Logger logger = Logger.getLogger("Ex2.class");

    public Ex2(int[] ar) {
        array = ar;
        elemCount = ar.length;
    }


    public void sort(){     
        for (int out = elemCount - 1; out >= 1; out--){  
            for (int in = 0; in < out; in++){       
                if(array[in] > array[in + 1])               
                    swap(in, in + 1);             
            }
            logger.info(getArrayAsString());
        }
    }


    private String getArrayAsString(){
        StringBuilder sb = new StringBuilder();
        for (int i : array) {
            sb.append(i);
            sb.append(' ');
        }
        return sb.toString();
    }

    private void swap(int first, int second){ 
        int tmp = array[first];      
        array[first] = array[second];       
        array[second] = tmp;          
    }
}
