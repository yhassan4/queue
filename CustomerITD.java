import java.util.*;

public class CustomerITD {
  public static void main(String[] args) {
    LinkedQueue queue = new LinkedQueue();
    int num;
    String first, last;
    int ID = 0;
    do {
      Scanner in = new Scanner(System.in);
      System.out.println("1- Insert");
      System.out.println("2- Remove");
      System.out.println("3- Who is next?");
      System.out.println("4- Check if empty");
      System.out.println("5- Check the size");
      System.out.println("6- Check if contains");
      System.out.println("7- Display the queue");
      System.out.println("0- Stop");
      System.out.print("Enter your choice: ");
      num = in.nextInt();
      if (num == 1) {
        System.out.print("Enter the first name: ");
        in = new Scanner(System.in);
        first = in.nextLine();
        System.out.print("Enter the last name: ");
        in = new Scanner(System.in);
        last = in.nextLine();

        if (ID == 0) {
          ID = (int)(Math.random() * (9999 - 1000 + 1) + 1000);
        } else {
          ID++;
        }

        queue.enqueue(first, last, ID);
        System.out.println();
      } else if (num == 2) {
        queue.dequeue();
        System.out.print("Removed");
        System.out.println();

      } else if (num == 3) {
        System.out.println("Next is: "); queue.peekFront();
        System.out.println();

      } else if (num == 4) {
        System.out.println("Empty? " + queue.isEmpty());
        System.out.println();

      } else if (num == 5) {
        System.out.println("Size: " + queue.size());
        System.out.println();

      } else if (num == 6) {
        System.out.print("Contains: ");
        in = new Scanner(System.in);
        System.out.println(queue.contains(in.nextLine()));

      } else if (num == 7) {
        queue.display();
        System.out.println();

      } else if (num == 0) {
        System.out.println("Bye");
      } else {
        System.out.println("Please enter a number between 0 and 7");
      }
    } while (num != 0);
  }
}
