import java.util.*;
import java.util.stream.*;

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
}

public class ProductFilter {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Phone", 15000, "Electronics"),
            new Product("Notebook", 100, "Stationery"),
            new Product("Pen", 20, "Stationery"),
            new Product("Headphones", 499, "Electronics"),
            new Product("Mouse", 750, "Electronics"),
            new Product("Mug", 300, "Kitchen")
        );

        System.out.println("Products under ₹500:");
        products.stream()
                .filter(p -> p.price < 500)
                .forEach(p -> System.out.println(p.name));

        System.out.println("\nElectronics category:");
        products.stream()
                .filter(p -> p.category.equals("Electronics"))
                .map(p -> p.name)
                .forEach(System.out::println);

        System.out.println("\nAll product names sorted by price:");
        products.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(p -> System.out.println(p.name + " – ₹" + p.price));
    }
}
