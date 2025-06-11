public class Check {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 100 (excluding multiples of 10):");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 10 == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }
    }
}
