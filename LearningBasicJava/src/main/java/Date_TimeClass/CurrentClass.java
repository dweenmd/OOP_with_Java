package Date_TimeClass;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentClass {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter);
        System.out.println(formattedTime);
    }
}
