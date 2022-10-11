import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Stack;

/**
 * CSC 6301 – Software Design & Documentation
 * 
 * Project 05:
 * This class reads a list of Integer numbers from the scanned
 * input and saves them into a Stack sorted from the smallest to the
 * largest, using the Collections Framework.
 * 
 * Version 1.0.0 saved the scanned input into a Linked List.
 * 
 * @author Billy Dempsey
 *         dempseyw@merrimack.edu
 * @version 2.0.0
 * @since Week 5 of CSC6301
 */
 public class StackDemo {
    
    /** 
     * Main Method of the class.
     * @param args default parameter for a main - not used
     * @since Week 5 of CSC6301
     */
    public static void main(String[] args) {
        
        //LinkedList<Integer> list = new LinkedList<>(); // Creating List in version 1.0.0
        Stack<Integer> stack = new Stack<>(); // Creating Stack in version 2.0.0

        Scanner sc = new Scanner(System.in); //Creating the Scanner

        // Prompt user for input
        System.out.println("Enter Integers to add to a Stack. Enter 'x' or any character when finished. ");
        while (sc.hasNextInt()) {
            System.out.println("Enter: ");
            int number = sc.nextInt();
            //list.add(number); // Add to list in version 1.0.0
            stack.push(number); // Add to stack in versions 2.0.0
        }
        sc.close();

        //System.out.println("Unsorted Linked List"); // Display unsorted list in version 1.0.0
        //System.out.println(list);
        System.out.println("Unsorted Stack"); // Display unsorted stack in version 2.0.0
        System.out.println(stack);

        //Collections.sort(list); // Sorting list in version 1.0.0
        Collections.sort(stack); // Sorting stack in version 2.0.0
 
        //System.out.println("Sorted Linked List:"); // Display sorted list in version 1.0.0
        //System.out.println(list);
        System.out.println("Sorted Stack:"); // Display sorted stack in version 2.0.0
        System.out.println(stack);
    

    }
    
 }