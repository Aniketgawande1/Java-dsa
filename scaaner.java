import java.util.*;
public class scaaner {
   public static void main (String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
      String name = sc.nextLine();
       System.out.println(name);
       sc.close();
   }

   }
}
