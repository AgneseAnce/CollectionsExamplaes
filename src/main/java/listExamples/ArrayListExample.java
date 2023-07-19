package listExamples;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public void firstExampleStringItems(){
        // All kinds of List subclasses implement the List interface
        // The Collections class provides more methods for manipulating lists
        List<String> products = new ArrayList<>();

        // Items are added to the bottom of the list
        // Items are ordered in the sequence of their addition (First In, First Out)
        // Lists can contain duplicates

        products.add("Rice"); // [0]
        products.add("Bread"); // [1]
        products.add("Pasta"); // [2]
        products.add("Soap"); // [3]
        products.add("Milk"); // [4]
        products.add("Rice"); // [5]
        products.add("Ice"); // [6]
        products.add("Mango"); // [7]

        System.out.println(products);

        // FOR EACH loop to cycle through items of the List
        for (String currentItem: products) {
            System.out.println(currentItem);
            // Do some more activities with list items
        }
    }

    public void secondExampleWithObject(){
        System.out.println("===== Example ArrayList with Object =====");

        // Create a Product class in the same package
        List<Product> products = new ArrayList<>();

        products.add(new Product("Rice", 94.13));
        products.add(new Product("Milk", 74.21));
        products.add(new Product("Ice", 4.59));
        products.add(new Product("Cucumbers", 116.19));
        products.add(new Product("Rice", 85.31));
        products.add(new Product("Socks", 12.14));

        // FOR EACH loop: data type temp variable : list name
        for(Product currentProduct : products){
            System.out.println(currentProduct.getName() + " - " + currentProduct.getPrice() + " EUR");
        }

        // The same ads ForEach but with Lambda
        products.forEach(currentProduct -> System.out.println(currentProduct + " EUR"));
        products.forEach(currentProduct -> {
            // Do some manipulations with data
            System.out.println(currentProduct + " EUR");
        });

        System.out.println("==== With Lambda Expression and Sort ====");
        // Shorthand Lambda method in case data from the loop needs to be sent to a 3rd party class/method
        products.forEach(System.out::println);


        // In-built Java Collections class includes a range of methods and functions
        // Sorting method that cycles through the list to arrange it in a specific order
        Collections.sort(products, new Comparator<Product>() {
            @Override
            public int compare(Product product1, Product product2) {
                // Longer version for sorting products by price
                /*
                if(product1.getPrice() > product2.getPrice()) return -1;
                if(product1.getPrice() < product2.getPrice()) return 1;
                if(product1.getPrice() == product2.getPrice()) return 0;
                return 0; // Default options
                */

                // Shorter version with ternary operator
                if(product1.getPrice() == product2.getPrice()) return 0;
                return product1.getPrice() > product2.getPrice() ? -1 : 1;

            }
        });

        System.out.println("==== With Lambda Expression and Sort ====");
        products.forEach(System.out::println);

        System.out.println("==== Sort in reverse order ====");
        Collections.reverse(products);
        products.forEach(currentProduct -> System.out.println(currentProduct + " EUR"));
    }
}
