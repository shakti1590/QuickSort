import java.util.*;
import java.text.*;

public class Solution {
  public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      double payment = scanner.nextDouble();
      scanner.close();
      
      NumberFormat n = NumberFormat.getCurrencyInstance(Locale.US);
      String us = n.format(payment);
      NumberFormat n1 = NumberFormat.getCurrencyInstance(new Locale("en", "IN));
      String india = n1.format(payment);
      
      System.out.println("US: " + US);
      System.out.println("India: " + india);
      
      }
}
      
      
