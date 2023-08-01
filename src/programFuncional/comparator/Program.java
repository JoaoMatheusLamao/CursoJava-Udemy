package programFuncional.comparator;

import java.util.*;

public class Program {

    public static void main(String[] args) {
//        List<Product> products = new ArrayList<>();
//
//        products.add(new Product("TV", 900.00));
//        products.add(new Product("Notebook", 1200.00));
//        products.add(new Product("Tablet", 450.00));
//
//        Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//
//        products.sort(comp);
//
//        for (Product p:
//             products) {
//            System.out.println(p);
//        }

        exemplo();

    }

    public static void exemplo(){
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(12);
        numbers.add(9);
        numbers.add(5);
        numbers.add(-10);

//        numbers.sort((n1, n2)->n1.compareTo(n2));

//        Collections.sort(numbers);

        for (Integer n: numbers){
            System.out.println(n.toString());
        }

    }

}
