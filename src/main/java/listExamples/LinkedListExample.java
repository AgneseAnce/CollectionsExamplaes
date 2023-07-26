package listExamples;

import model.Product;

import java.util.LinkedList;

public class LinkedListExample {

    public void firstExampleWithString(){
        LinkedList<String> studentNames = new LinkedList<>();

        studentNames.add("Zino");
        studentNames.add("Agnese");
        studentNames.add("Olga");
        studentNames.add("Rasa");

        System.out.println("==== Linked List Example ====");
        System.out.println(studentNames);

        studentNames.get(3);
        // Items can be added to specific locations by their index
        // .add does not replace the existing items but move them downwards
        studentNames.add(0, "Emīls");
        studentNames.add(4, "Markuss");
        studentNames.add(5, "Gustavs");

        System.out.println(studentNames);
    }

    public void secondExampleOOP(){
        System.out.println("==== LinkedList with OOP ====");
        LinkedList<Product> products = new LinkedList<>();

        products.add(new Product("Rice", 34));
        products.add(new Product("Soap", 35));
        products.add(new Product("Oil", 36));
        products.add(new Product("Bran", 37));
        products.add(new Product("Rice", 38));

        System.out.println(products);



    }
}
