
package Date_TimeClass;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;


public class CurrentDate {
    public static void main(String[] args) {
        Date date=new Date();
        System.out.println(date);
        
        DateFormat dateFormate=new SimpleDateFormat("dd/mm/yyyy");
        String currentDate =dateFormate.format(date);
        System.out.println("current date: "+currentDate);
    }
}