package programFuncional.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        list.forEach(System.out::println);
        System.out.println("-----------------");

        list.removeIf(x -> x.getPrice() > 100);
        List<String> nova = list.stream().map(x -> x.getName().toUpperCase()).collect(Collectors.toList());

        list.forEach(System.out::println);
        nova.forEach(System.out::println);
    }
}
