package StringPackeg;

public class SringBuilderDemo {

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Dween");
        System.out.println("str = " + str);
        
        str.append(" Mohammad");
        System.out.println(str);
        
        str.append(" 210353");
        System.out.println(str);
        //reverse() and delete() same as stringBuffer
    }
}
