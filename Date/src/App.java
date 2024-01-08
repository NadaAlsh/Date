import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {

        Date thisMoment = new Date();
        System.out.println("Current date and time: " + thisMoment);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDate = formatter.format(thisMoment);
        Date today = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(today);
        calendar.add(Calendar.DAY_OF_MONTH, 5); // Adding 5 days
        System.out.println("Formatted Date: " + formattedDate);
        calendar.setTime(thisMoment);
        Date futureDate = calendar.getTime();
        System.out.println("Date after 5 days: " + futureDate);

        Date date1 = new Date(2023);
        Date date2 = new Date(2024);
        boolean isBefore = date1.before(date2);
        System.out.println("Is date1 before date2? " + isBefore);
    }
}
