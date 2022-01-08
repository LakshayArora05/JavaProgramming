import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
      System.out.println("Enter a Positive Number:"); 
      int a;
      int i;
     
      a= read.nextInt();
      if(a<1)
        {
            System.out.println("Neither odd nor even");
            System.exit(0);
        }
      
          if (a%2==0)
           System.out.println("it is even number");
              
            
          else
          System.out.println("it is an odd number");
          
          
      
      
      
     
      
    }
    }
