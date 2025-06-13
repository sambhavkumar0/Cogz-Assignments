import java.util.*;
import java.util.stream.*;

public class LambdaEx {
    public static void main(String[] args) {
        List<String> employeeNames = Arrays.asList("Alice", "Bob", "Ankit", "David", "Ayesha");

        System.out.println("Names starting with 'A' in uppercase:");
        employeeNames.stream()
                .filter(name -> name.startsWith("A"))
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
