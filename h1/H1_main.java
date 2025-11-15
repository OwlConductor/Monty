package h1;

import java.util.Random;

public class H1_main {
    public static void main(String args[]) {
        Random random = new Random();
        int z = random.nextInt();
        
        //System.out.println(String.valueOf(z));
        if(z>10)
            z =  z - 10;
        //System.out.println(String.valueOf(z));
    }
    
}
