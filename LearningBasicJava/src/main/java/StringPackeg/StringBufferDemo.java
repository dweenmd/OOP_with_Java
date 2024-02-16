package StringPackeg;

public class StringBufferDemo {
    public static void main(String[] args) {
        //string biffer e main string ke jekono somoy change korte pari
        StringBuffer sb = new StringBuffer("Dween Mohammad");
        
        // Printing the StringBuffer object
        System.out.println(sb);
        
        //string append
        sb.append(" Roll: ");
        sb.append(210353);
        System.out.println(sb);
        
        //string reverse
        sb.reverse();
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        
        //elements delete from string
        sb.delete(6, 15); //6 index to 15 index
        System.out.println(sb);
        
        
    }
}
