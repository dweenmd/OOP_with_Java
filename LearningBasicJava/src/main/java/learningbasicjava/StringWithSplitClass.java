
package learningbasicjava;

public class StringWithSplitClass {

    public static void main(String[] args) {
        String s1 = "This is my country";
        System.out.println(s1);

        String s2 = s1.replace('i', 'k');
        System.out.println(s2);

        String[] s3 = s1.split(" ");
        //foreach condition
        for (String x : s3) {
            System.out.println(x);
        }
    }

}
