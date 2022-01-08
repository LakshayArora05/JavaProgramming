import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
      int first;
      int second;
      int third;
      System.out.println("Enter the first Number:"); 
      first= read.nextInt();
      System.out.println("Enter the second  Number:"); 
      second= read.nextInt();
      System.out.println("enter the third number");
      third= read.nextInt();
      if (first>=second){
          if (first>=third)
                    System.out.println("First is the greatest");
          else
                    System.out.println("Third is the greatest");
      }
      else if (second>=first)
               if (second>=third)
                     System.out.println("Second is greatest");
               else 
                     System.out.println("third is the greatest");
     
      
          
      }
     
      
   
      
      
     }
    

    
