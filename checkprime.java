import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
      System.out.println("Enter a Positive Number:"); 
      int a;
      int i;
      int b=0;
      a= read.nextInt();
      if(a<=1)
        {
            System.out.println("Neither prime nor composite");
            System.exit(0);
        }
      for (i=2;i<=a/2;i++)
      {
          if (a%i==0){
          
              b=1;
              break;
          }
          
      }
      
      
      if (b==1)
      System.out.println("it is not a prime number");
              
          
      else
          
     System.out.println("it is  prime number");
          
          
      
    }
    }
