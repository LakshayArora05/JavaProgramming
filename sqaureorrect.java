import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
      int first;
      int second;
      System.out.println("Enter the first positive Number:"); 
      first= read.nextInt();
      System.out.println("Enter the second positive Number:"); 
      second= read.nextInt();
      if (first==second)
      System.out.println("it is a square");
      else
      System.out.println("it is a rectangle");
      
      
   
      
      
     }
    }
    
