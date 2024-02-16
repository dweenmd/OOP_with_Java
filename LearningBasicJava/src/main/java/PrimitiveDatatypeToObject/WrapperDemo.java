package PrimitiveDatatypeToObject;

public class WrapperDemo {

    public static void main(String[] args) {
        //primitive to object(autoboxing)
        System.out.println("autoboxing\n");
        int x = 30;
        Integer y = Integer.valueOf(x);
        System.out.println("y = " + y);

        Integer z = x;//Integer.valueof(x)-> (compiler automatic eta dhore nibe) etake [ autoboxing ] bole..
        System.out.println("z = " + z);

        //object to premitive data type(unboxing)
         System.out.println("\nunboxing\n");
        Double d = new Double(10.25);
        System.out.println("d = "+d);
        
        double e=d.doubleValue();
        System.out.println("e = "+e);
        
        double f=d;//d.doublevalue()--> (unboxing)
        System.out.println("f = "+f);

    }

}
