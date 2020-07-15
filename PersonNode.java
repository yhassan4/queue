public class PersonNode<T>
{
   protected T firstName;
   protected T lastName;
   protected T serviceNum;
   protected PersonNode<T> link;

   public PersonNode(T firstName, T lastName, T serviceNum)
   {
      this.firstName = firstName;
      this.lastName = lastName;
      this.serviceNum = serviceNum;
      this.link = null;
   }

   public void setFirstName(T firstName)
   {
      this.firstName = firstName;
   }

   public T getFirstName()
   {
      return this.firstName;
   }

   public void setLastName(T lastName)
   {
      this.lastName = lastName;
   }

   public T getLastName()
   {
      return this.lastName;
   }

   public void setServiceNumber(T serviceNum)
   {
      this.serviceNum = serviceNum;
   }

   public T getServiceNumber()
   {
      return this.serviceNum;
   }

   public void setLink(PersonNode<T> link)
   {
      this.link = link;
   }

   public PersonNode<T> getLink()
   {
      return this.link;
   }
}
