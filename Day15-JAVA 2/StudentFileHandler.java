import java.io.*;
import java.util.*;

public class StudentFileHandler {
    public static void main(String[] args) {

        List<String> students = Arrays.asList("Sam", "Ram", "Bam", "Damn", "Lamb");

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("students.txt"))) {
            for (String name : students) {
                writer.write(name);
                writer.newLine();
            }
            System.out.println("Student names written to students.txt\n");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Step 3: Read file and print names in uppercase
        System.out.println("Names in UPPERCASE:");
        try (BufferedReader reader = new BufferedReader(new FileReader("students.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }
}
