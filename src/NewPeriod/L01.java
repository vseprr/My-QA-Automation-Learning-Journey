package NewPeriod;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class L01 {
    public static void main(String[] args) {
        LocalDateTime istanbul = LocalDateTime.now();
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm MMM E");
        String formatDateTimeOfIstanbul = istanbul.format(formatter1);
        System.out.println(formatDateTimeOfIstanbul);




    }
}
