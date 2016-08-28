/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package acadglid;

import java.util.Scanner;

/**
 *
 * @author My
 */
public class Session_4_Assignment_4 {
    public static void main(String args[])
   {
      String original, reverse = "";
      Scanner in = new Scanner(System.in);
 
      System.out.println("Enter a string to reverse");
      original = in.nextLine();
 
      int length = original.length();
 
      for ( int i = length - 1 ; i >= 0 ; i-- )
         reverse = reverse + original.charAt(i);
 
      System.out.println("Reverse of entered string is: "+reverse);
   }
}
