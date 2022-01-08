import java.util.Scanner;
public class Radiusofcircle {
    public static void main(String[] args) {
      Scanner read= new Scanner(System.in);
      System.out.println("Enter a Positive Number:"); 
      double radius;
      int i;
      double area;
      double circumference;
     
      radius= read.nextInt();
      circumference=radius*3.14*2;
      System.out.println("circumference= " +circumference);
      area=3.14*radius*radius;
      System.out.println("area of circle=" +area);
      
      
     }
    }
