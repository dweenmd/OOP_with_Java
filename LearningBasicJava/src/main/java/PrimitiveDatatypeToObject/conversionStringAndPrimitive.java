package PrimitiveDatatypeToObject;

public class conversionStringAndPrimitive {

    public static void main(String[] args) {
        
        //example of primitive to string conversion
        int i = 100;
        String s = Integer.toString(i);//here Integer is wrapper class
        System.out.println("s = " + s);
        double j = 200.55;

        String k = Double.toString(j);
        System.out.println("k = " + k);
        
        boolean b=true;
        String c=Boolean.toString(b);
        System.out.println("c = "+c);
        
        
        //string->primitive
        System.out.println("\nexample of string to premitive datatype conversion");
        String e="210";
        int f=Integer.parseInt(e);
        System.out.println("f = "+f);
        double g=Double.parseDouble(e);
        System.out.println("g = "+g);
        
        System.out.println("methode 2. ");
        
        String m="379";
        int n= Integer.valueOf(m);
        System.out.println("n = "+n);
        
    }
}
