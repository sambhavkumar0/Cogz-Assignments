package Exception_Handling;

public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught exception: " + e);
            System.out.println("Original cause: " + e.getCause());
        }
    }

    static void method1() throws Exception {
        try {
            method2();
        } catch (NumberFormatException e) {

            throw new Exception("Failed to process input", e);
        }
    }

    static void method2() {
        String str = "abc";// throws number format exception
        int num = Integer.parseInt(str);
    }
}
