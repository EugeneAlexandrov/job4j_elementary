import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Info {
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d.MM.YYYY");
    public static void main(String [] args) {
        System.out.println(dtf.format(LocalDateTime.now()));
    }
}
