import java.io.*;
import java.util.*;

public class StudentFiles {
    public static void main(String[] args) throws IOException {

        List<String> students = Arrays.asList("Salman", "sharukh", "amir", "vicky", "ranbir");

        PrintWriter writer = new PrintWriter("students1.txt");
        for (String name : students) {
            writer.println(name);
        }
        writer.close();
        System.out.println("Student names written to students.txt\n");

        BufferedReader reader = new BufferedReader(new FileReader("students1.txt"));
        String line;
        System.out.println("Names in UPPERCASE:");
        while ((line = reader.readLine()) != null) {
            System.out.println(line.toUpperCase());
        }
        reader.close();
    }
}
