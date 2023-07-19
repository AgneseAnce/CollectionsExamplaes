import listExamples.ArrayListExample;
import listExamples.LinkedListExample;

public class Main {
    public static void main(String[] args) {
        // Create an object of the ArrayListExample class
        ArrayListExample arrayListExample = new ArrayListExample();
        System.out.println("===== Examples with array list =====");
        arrayListExample.firstExampleStringItems();

        arrayListExample.secondExampleWithObject();

        LinkedListExample linkedListExample = new LinkedListExample();
        System.out.println("==== Examples with Linked List ====");
        linkedListExample.firstExampleWithString();

        linkedListExample.secondExampleOOP();

    }

}
