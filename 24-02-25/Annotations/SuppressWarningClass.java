import java.util.*;
public class SuppressWarningClass {
   public static void main(String[]args){
   	@SuppressWarnings("unchecked")
   	ArrayList list=new ArrayList();
   	list.add("Nishant");
   	list.add("Nitin");
   	list.add("Archit");
   	for(Object l:list){
       	System.out.println((String)l);
   	}

   }
}
