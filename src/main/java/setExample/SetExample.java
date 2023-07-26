package setExample;

import com.sun.source.tree.Tree;
import model.Student;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    /* 3 main types:
    * HashSet
    * TreeSet
    * LinkedHashSet
    * */

    // Important methods: equals, hashCode

    public void exampleHashSetWithString(){
        HashSet<String> studentNames = new HashSet<>();

        if (studentNames.isEmpty()){
            System.out.println("Please add students to the List");
        }

        studentNames.add("Olga");
        studentNames.add("Arta");
        studentNames.add("Laura");
        studentNames.add("Zino");
        studentNames.add("Ramune");
        studentNames.add("Zino");
        studentNames.add("Kitija");

        System.out.println(studentNames);

        // Case sensitive search
        if (studentNames.contains("Zino")) {
            System.out.println("Zino is found");
        }

        // For Each
        for (String studentName: studentNames){
            System.out.println(studentName);
        }
    }
    public void examplesHashSetWithOOP() {
        HashSet<Student> students = new HashSet<>();

        students.add(new Student("Zino", 9));
        students.add(new Student("James", 10));
        students.add(new Student("Mary", 7));
        students.add(new Student("Elina", 6));
        students.add(new Student("Sam", 8));
        students.add(new Student("Julia", 10));

        System.out.println(students);

        for (Student student : students) {
            System.out.println(student);
            this.doSomethingMore(student);
        }

        try {
            this.doSomethingWithException();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    public void exampleLinkedHashSet(){
        Set<String> studentNames = new LinkedHashSet<>();

        studentNames.add("Gustavs");
        studentNames.add("Emīls");
        studentNames.add("Markuss");
        studentNames.add("Emīls");
        studentNames.add("Gena");

        System.out.println(studentNames);
    }

    public void exampleTreeSet(){
        System.out.println("=== TreeSet example");
        TreeSet<String> studentName = new TreeSet<>();

        studentName.add("Gustavs");
        studentName.add("Emīls");
        studentName.add("Markuss");
        studentName.add("Emīls");
        studentName.add("Gena");

        System.out.println("Examples with primitive types");

        // Method for printing out in static classes
        studentName.forEach(System.out::println);


        System.out.println("Examples with customer object (Student): ");

        TreeSet<Student> students = new TreeSet<>();

        students.add(new Student("Gustavs", 10));
        students.add(new Student("Emīls", 9));
        students.add(new Student("Markuss", 8));
        students.add(new Student("Gustavs", 10));
        students.add(new Student("Gena", 6));

        // Display all items
        students.forEach(System.out::println);
        // In the current condition cannot be run without Comparison method

        // To sort in descending order
        System.out.println(students.descendingSet());

        System.out.println(students.contains(new Student("Emīls", 10))); // False
        System.out.println(students.contains(new Student("Emīls", 9))); // True

        System.out.println(students.first());
        System.out.println(students.last());

        // Removes an item that fully match the pattern
        System.out.println(students.remove(new Student("Gena", 6)));
        // If only some item details are known
        students.removeIf(currentStudent -> currentStudent.getName().equals("Markuss"));

        System.out.println(students);
        
    }

        private void doSomethingWithException () throws Exception { }

        private void doSomethingMore(Student student) { }

}
