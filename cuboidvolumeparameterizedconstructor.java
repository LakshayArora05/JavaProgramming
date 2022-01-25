import java.util.*;  

public class Vol

{

int l,h,b,v;                                                     //instance variable

Vol(int length,int height,int breadth)                             //parameterized constructor

{

l=length;

h=height;

b=breadth;

}

void findtheVol() //Method to find volume

{

v=l*b*h;

System.out.println("Volume: "+v);

}

public static void main(String args[] )
{
    
Scanner sc=new Scanner(System.in);  
System.out.print("Enter Length- ");  
int a= sc.nextInt();  
System.out.print("Enter height- ");  
int b= sc.nextInt();  
System.out.print("Enter beadth- ");  
int c= sc.nextInt(); 

Vol v = new Vol(a,b,c);                               // This would invoke the parameterized constructor

v.findtheVol();

   }

}
