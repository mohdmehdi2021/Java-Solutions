import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTimeDisplay {

    public static void main(String[] args) throws Exception {

        while (true) {
            Date date = new Date();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E yyyy-MM-dd hh:mm:ss a");
            Thread.sleep(1000);
            System.out.print("\r "+simpleDateFormat.format(date));
        }


    }
}
