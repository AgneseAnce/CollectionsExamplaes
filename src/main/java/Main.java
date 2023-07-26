import listExamples.ArrayListExample;
import listExamples.LinkedListExample;
import mapExample.MapExample;
import queueExample.DequeueExample;
import queueExample.QueueExample;
import setExample.SetExample;

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

        System.out.println("==== Example with Queue ====");
        QueueExample queueExample = new QueueExample();
        queueExample.firstExampleWithString();

        System.out.println("=== Queue example with OOP ===");
        queueExample.secondExampleWithOOP();

        System.out.println("==== Dequeue Example with String ====");
        DequeueExample dequeueExample = new DequeueExample();
        dequeueExample.firstExampleWithString();

        System.out.println("==== Example with Set ====");
        SetExample setExample = new SetExample();
        setExample.exampleHashSetWithString();

        System.out.println("=== HashSet with OOP ===");
        setExample.examplesHashSetWithOOP();

        System.out.println("=== Example with LinkedHashSet ===");
        setExample.exampleLinkedHashSet();

        setExample.exampleTreeSet();

        System.out.println("=== Map Example ===");
        MapExample mapExample = new MapExample();
        mapExample.firstExampleHashMap();

        System.out.println("== 2nd map example ===");
        mapExample.firstExampleTreeMap();

    }

}
