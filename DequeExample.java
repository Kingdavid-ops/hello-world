import java.util.*;
import java.util.Scanner;
public class DequeExample {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();


        System.out.println("Enter a name: ");
        String name;
        try (Scanner sc = new Scanner(System.in)) {
            name =sc.nextLine();
        }
        deque.add(name);
        deque.add("Collins");
        deque.add("Java");
        System.out.println(deque);   //Collins Java
        deque.addFirst("Fruit");   //Fruit Collins Java
        deque.addLast("Last");     //Fruit Collins JAva Last


        deque.addFirst("New First");  //New First  Fruit Collins Java Last
        deque.addFirst("New Last");  //New First  Fruit Collins Java Last  NewLast


        System.out.println("ArryDeque");
        System.out.println(deque);                //[NewFirst Fruit Collins Java Lst NewLst]
        System.out.println(deque.size());



        //Removing elements from Deque
        System.out.println("Remove first: " + deque.removeFirst());
        System.out.println("Remove last: " + deque.removeLast());
        System.out.println("Deque after reoval: " + deque);    //Fruit, Collins, Java, Last


        //Using LinkedList as a Deque 
        Deque<String> linkedDeque = new LinkedList<>();
        linkedDeque.addFirst("Start");
        linkedDeque.addLast("End");


        System.out.println("\nLinkedList as Deque: ");
        System.out.println(linkedDeque);





        //Peek elements from LinkedList Deque 
        System.out.println("First element: " + linkedDeque.peekFirst());
        System.out.println("Last element: " + linkedDeque.peekLast());
    }
}
