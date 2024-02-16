package StringPackeg;

public class stringCompare {

    public static void main(String[] args) {
        System.out.println("String compare: ");
        String s1 = "Dween Mohammad";
        String s2 = new String("Dween Mohammad");
        int len = s1.length();
        System.out.println("Length of s1: " + len);

        if (s1 == s2) {// here == check the string referance(s1&s2) not string elelment
            System.out.println("Strings are Equals");
        } else {
            System.out.println("Strings are NOT Equals");
        }
        if (s1.contains(s2)) {//now its check the strings element
            System.out.println(" Equals");
        } else {
            System.out.println(" NOT Equals");
        }
        if (s1.equals(s2)) {//now its check the strings element
            System.out.println(" Equals");
        } else {
            System.out.println(" NOT Equals");
        }
    }

}
