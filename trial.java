import java.util.*;
public class trial
{
   static Iterator func(ArrayList mylist)
   {
        int k=0;
      Iterator it=mylist.iterator();
      String s;
      while(it.hasNext())
      {
         Object element = it.next();
         s=element+"";
         //System.out.println(s);
        if(s.compareTo("###")==0)//Hints: use instanceof operator
           break;
        k++;
      }
      System.out.println("k="+k);
      return it;
      
   }
// hare Krishna 
// hare Krishna 
// hare Krishna 
// hare Krishna 
// hare Krishna 
// hare Krishna 
   public static void main(String []argh)
   {
        int k=0;
      ArrayList mylist = new ArrayList();
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int m=sc.nextInt();
      for(int i=0;i<n;i++)
      {
         mylist.add(sc.nextInt());
      }
      mylist.add("###");
      for(int i=0;i<m;i++)
      {
         mylist.add(sc.next());
      }
      
      
      Iterator it=func(mylist);
      while(it.hasNext())
      {
         Object element = it.next();
         System.out.println((String)element);
         k++;
      }
      System.out.println("k="+k);
   }
}
