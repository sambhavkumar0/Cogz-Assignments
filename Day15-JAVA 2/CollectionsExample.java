import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(23, 12, 45, 6, 9, 18, 30, 21, 8, 10);

        System.out.println("Inserted Array: " + numbers);
        List<Integer> evenNumbers = new ArrayList<>();
        for (int num : numbers) {
            if (num % 2 == 0) {
                evenNumbers.add(num);
            }
        }

        Collections.sort(evenNumbers);
        System.out.println("Sorted list: " + evenNumbers);

        HashMap<Integer, String> employees = new HashMap<>();
        employees.put(1, "A");
        employees.put(2, "Ab");
        employees.put(3, "Abc");
        employees.put(4, "Abcd");

        System.out.println("\nKey -> Value:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
