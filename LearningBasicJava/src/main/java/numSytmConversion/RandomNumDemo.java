
package numSytmConversion;

import java.util.Random;

public class RandomNumDemo {
    public static void main(String[] args) {
        Random rand=new Random();
        int randomNumber=rand.nextInt(10);//0 to 10
        System.err.println("Random number: "+randomNumber);
    }
    
}
