package queueExample;

import model.Product;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

    /*
     * FIFO - First In, First Out
     * LIFO - Last In, First Out
     * */
    public void firstExampleWithString(){
        // LinkedList supports implementation of queues
        Queue<String> customers = new LinkedList<>();

        customers.offer("Agnese");
        customers.offer("Vitālijs");
        customers.offer("Gustavs");
        customers.offer("Emīls");
        customers.offer("Markuss");

        System.out.println(customers);

        this.attendToCustomer(customers.peek()); // To view the next item; will not remove the item from the list

        this.attendToCustomer(customers.poll()); // To remove the customer from the queue
        this.attendToCustomer(customers.poll());
        this.attendToCustomer(customers.poll());
        this.attendToCustomer(customers.poll());

        System.out.println(customers);

        if (!customers.isEmpty()){
            this.attendToCustomer(customers.poll());
        }

        System.out.println("We have attended to all customers: " + customers.isEmpty());
    }

    public void secondExampleWithOOP(){
        Queue<Product> products = new LinkedList<>();
        products.offer(new Product("Phone", 2.50));
        products.offer(new Product("Car", 123652.50));
        products.offer(new Product("Table", 2589.50));
        products.offer(new Product("Spoon", 122.50));
        products.offer(new Product("Milk", 12.50));

        System.out.println(products.poll()); // Returns null if the queue is empty
        System.out.println(products.remove()); // Removes the first item; throws exception if the queue is empty

        Product currentProduct = products.poll();
        System.out.println("Current product: " + currentProduct.getName());

        System.out.println(products.element()); // Returns an item without removing it but throws an exception of no items found

    }
    public void attendToCustomer(String customer){
        // code
        System.out.println("Attending to customer: " + customer);
}
}
