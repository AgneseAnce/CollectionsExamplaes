package queueExample;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;

public class DequeueExample {

    public void firstExampleWithString(){
        Deque<String> cars = new ArrayDeque<>();

        cars.offer("Volvo");
        cars.offer("Toyota");
        cars.addFirst("Masseratti");
        cars.addLast("Audi");
        cars.offer("BMW");
        cars.addFirst("Porsche");
        cars.offer("Skoda");
        cars.addFirst("Volkswagen");
        System.out.println(cars);

        /*
        * Volkswagen, Porsche, Masseratti, Volvo, Toyota, Audi, BMW, Skoda*/


        cars.pollFirst();  // Removes an item from the top of the list
        cars.pollLast();  // Removes an item from the bottom of the list

        // Shows an item without removing it from the list
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        cars.poll();
        cars.pollFirst();
        cars.pollLast();

         System.out.println(cars);

        // Removes items but throws an exception if there are no items left on the queue
        try {
            cars.removeFirst();
            cars.removeLast();
            cars.remove();
        } catch (NoSuchElementException exception) {
            System.out.println(exception.getMessage());
        }




    }
}
