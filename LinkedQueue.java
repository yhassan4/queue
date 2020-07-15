public class LinkedQueue<T>
{
   protected PersonNode<T> front;
   protected PersonNode<T> rear;
   protected int numElements;

   public LinkedQueue()
   {
      front = null;
      rear = null;
      numElements = 0;
   }

   public void enqueue(T fName, T lName, T sNum)
   {
      //Complete this method as required in the homework instructions.
      PersonNode<T> newNode = new PersonNode<T>(fName, lName, sNum);

      if (front == null) {
        front = newNode;
      } else {
        rear.setLink(newNode);
      }
      rear = newNode;
      numElements++;

   }


   public T dequeue()
   {
      //Complete this method as required in the homework instructions.
      String temp;
      if (isEmpty()) {
        throw new QueueUnderflowException("Empty queue!");
      } else {
        temp = front.getFirstName() + " " + front.getLastName() + ", " + front.getServiceNumber();
        front = front.getLink();
        if (front == null) {
          rear = null;
        }
        numElements--;
        return (T)temp;
      }
   }

   public void peekFront()
   {
      //Complete this method as required in the homework instructions.
      if (isEmpty()) {
        throw new QueueUnderflowException("Empty queue!");
      } else {
        System.out.println(front.getFirstName() + " " + front.getLastName() + ", " + front.getServiceNumber());
      }
   }

   public boolean contains(T lookFor)
   {
      //Complete this method as required in the homework instructions.
      boolean bool = false;
      PersonNode<T> curr = front;
      while (curr != null) {
        if (curr.getFirstName().equals(lookFor) || curr.getLastName().equals(lookFor)) {
          bool = true;
          System.out.println(curr.getFirstName() + " " + curr.getLastName() + ", " + curr.getServiceNumber());
        }
        curr = curr.getLink();
      }
      return bool;
   }

   public void display()
   {
      //Complete this method as required in the homework instructions.
      PersonNode<T> currNode = front;
      while(currNode != null){
       System.out.println(currNode.getFirstName() + " " + currNode.getLastName() + ", " + currNode.getServiceNumber());
       currNode = currNode.getLink();
      }
   }

   public int size()
   {
      return numElements;
   }

   public boolean isFull()
   {
      return false;
   }

   public boolean isEmpty()
   {
      return numElements == 0;
   }
}
