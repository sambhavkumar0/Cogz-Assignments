import java.time.*;
import java.time.format.*;
import java.util.Scanner;

public class EventCountdown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter future event date (yyyy-MM-dd): ");
        String input = scanner.nextLine();

        try {
            LocalDate eventDate = LocalDate.parse(input);
            LocalDate today = LocalDate.now();

            if (eventDate.isBefore(today)) {
                System.out.println("That date is in the past!");
            } else {
                Period period = Period.between(today, eventDate);
                System.out.println("Your event is in " + period.getYears() + " years " + period.getMonths() +
                        " months and " + period.getDays() + " days.");
            }
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format.");
        }

        scanner.close();
    }
}
