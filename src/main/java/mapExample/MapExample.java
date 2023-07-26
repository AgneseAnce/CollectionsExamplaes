package mapExample;

import model.Product;
import model.Student;

import java.util.*;

public class MapExample {

    // LinkedHashMap
    // TreeMap
    // HashMap

    // Key : value

    public void firstExampleHashMap(){
        Map<String, Integer> studentScores = new HashMap<>();

        studentScores.put("Emīls", 10);
        studentScores.put("Markuss", 9);
        studentScores.put("Ilga", 8);
        studentScores.put("Gustavs", 7);
        studentScores.put("Agnese", 6);

        studentScores.put("Emīls", 9);

        System.out.println(studentScores);
        System.out.println(studentScores.get("Agnese"));
    }
    // CRUD - create, read, update, delete
    public void secondExampleHashMap(){
        Map<String, Integer> studentScores = new HashMap<>();

        // Add items
        studentScores.put("Aija", 45);
        studentScores.put("Maija", 40);

        // Find items
        // Ask by the key; by default does not return the key, only the v alue
        System.out.println(studentScores.get("Maija"));

        // Delete by the key
        studentScores.remove("Aija");

        // Update = same as add; if item exists, updates value
        studentScores.put("Maija", 15);

        System.out.println(studentScores);
    }
    public void thirdExampleHashMap(){
        System.out.println("=== HashMap OOP === ");
        Map<UUID, Student> students = new HashMap<>();

        Student student1 = new Student("Zino", 59);
        Student student2 = new Student("Laura", 78);
        Student student3 = new Student("Baiba", 99);
        Student student4 = new Student("Ilga", 59);

        new Student(UUID.randomUUID(), "Aija", 34);

        students.put(student1.getId(), student1);
        students.put(student2.getId(), student2);
        students.put(student3.getId(), student3);
        students.put(student4.getId(), student4);

        System.out.println(students);

        System.out.println(students.keySet()); // Gives the list of keys (list of UUID)
        System.out.println(students.values()); // Gives all values as collection, i.e. List
        // Converting from map to list
        List<Student> studentList = (List<Student>) students.values();

        // Converting from set to map
//        System.out.println(students.entrySet());

    }
    public void firstExampleTreeMap(){
        System.out.println("=== TreeMap Example ===");
        Map<Integer, String> studentNames = new TreeMap<>();

        studentNames.put(3, "Karolina");
        studentNames.put(1, "Zino");
        studentNames.put(5, "Ilga");
        studentNames.put(7, "Laura");
        studentNames.put(2, "Agnese");
        studentNames.put(2, "Agnese");

        System.out.println(studentNames);

        // Print out all items, Option 1
        studentNames.forEach((key, value) -> {
            // code
            // code
            //code
        });

        // Second Option, FOR loop; better modifiable
        for (Map.Entry<Integer, String> entry : studentNames.entrySet()){
            Integer k = entry.getKey();
            String v = entry.getValue();
            System.out.println("Student No. " + k + ", Student name" + v);
        }

        // Third option, FOR EACH + method
        studentNames.forEach(MapExample::handleStudent);
    }

    public void firstExampleLinkedHashMap(){
        Map<UUID, Product> listOfProducts = new LinkedHashMap<>();

        // Product class does not have ID; generated here
        listOfProducts.putIfAbsent(UUID.randomUUID(), new Product("Rice", 233));
        listOfProducts.putIfAbsent(UUID.randomUUID(), new Product("Ice", 23.32));
        listOfProducts.putIfAbsent(UUID.randomUUID(), new Product("Bread", 23.23));
        listOfProducts.putIfAbsent(UUID.randomUUID(), new Product("Maize", 233.11));
        listOfProducts.putIfAbsent(UUID.randomUUID(), new Product("Potatoe", 15.20));
        listOfProducts.putIfAbsent(UUID.randomUUID(), new Product("Cucumber", 10.40));

UUID idToUseForDuplicate = UUID.randomUUID();
listOfProducts.put(idToUseForDuplicate, new Product("Food", 123.23));
        listOfProducts.put(idToUseForDuplicate, new Product("Cucumber", 10.40));

        for (Map.Entry<UUID, Product> currentProduct : listOfProducts.entrySet()) {
            UUID productKey = currentProduct.getKey();
            Product product = currentProduct.getValue();

            System.out.println("Product ID: " + productKey + " Product: " + product);
        }
//        for (UUID id : listOfProducts.keySet()) {
//            // Do something with keys
//        }
//
//        for (Product product : listOfProducts.values()) {
//            // Do something with value
//        }
    }

public static void handleStudent(Integer key, String value) {
    System.out.println("Student No. " + key + ", Student name " + value);
}
}
