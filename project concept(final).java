import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class CalendarProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        System.out.print("Enter 'M' for a specific month, 'Y' for the whole year: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("M")) {
            System.out.print("Enter month (1-12): ");
            int month = scanner.nextInt();
            Calendar calendar = new GregorianCalendar(year, month - 1, 1);
            displayCalendar(calendar);
        } else if (choice.equalsIgnoreCase("Y")) {
            for (int month = Calendar.JANUARY; month <= Calendar.DECEMBER; month++) {
                Calendar calendar = new GregorianCalendar(year, month, 1);
                displayCalendar(calendar);
            }
        } else {
            System.out.println("Invalid choice. Please enter 'M' or 'Y'.");
        }
    }

    public static void displayCalendar(Calendar calendar) {
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);

        String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.ENGLISH);

        System.out.println("\n" + monthName + " " + year);

        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("    ");
        }
        int day = 1;
        while (calendar.get(Calendar.MONTH) == month) {
            System.out.printf("%3d ", day);
            calendar.add(Calendar.DATE, 1);
            if (calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                System.out.println();
            }

            day++;
        }
        System.out.println();
    }
}
