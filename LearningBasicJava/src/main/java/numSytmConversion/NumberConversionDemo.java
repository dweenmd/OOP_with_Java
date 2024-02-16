
package numSytmConversion;


public class NumberConversionDemo {
    public static void main(String[] args) {
        String binary="1010";
        Integer decimal=Integer.parseInt(binary,2);//here 2 is binary base2
        System.out.println(binary+" binary to decimal = " +decimal);
        
        String octal="4567";
        Integer decimal1=Integer.parseInt(octal,8);//here 8 is octal base2
        System.out.println(octal+" octal to decimal = " +decimal1);
        
        String hexadecimal="1A";
        Integer decimal2=Integer.parseInt(hexadecimal,16);
         System.out.println(hexadecimal+" Hexadecimal to decimal = " +decimal2);
    }
    
    
}
