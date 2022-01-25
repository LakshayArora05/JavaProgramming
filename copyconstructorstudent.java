import java.util.*;  
public class School 
{  
private double rollnumber;  
private String name;  

//constructor to initialize roll number and name of the student  
School(double Rollnumber, String Name)  
{   
this.rollnumber = Rollnumber;  
this.name =Name;  
}  

//creating a copy constructor  
School(School School)  
{  
System.out.println("\nAfter invoking the Copy Constructor:\n");  
this.rollnumber = School.rollnumber;  
this.name = School.name;  
}  

//creating a method that returns the roll number of the student  
double showRollnumber()  
{  
return rollnumber;  
}  
//creating a method that returns the name of the student  
String showName()  
{  
return name;  
}  
//class to create student object and print roll number and name of the student  
public static void main(String args[])  
{  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter roll number- ");  
int a= sc.nextInt();  
System.out.print("Enter name- ");  
String b= sc.next();  
School S = new School(a,b);  
System.out.println("Name of the first  student: "+ S.showName());  
System.out.println("Roll number of the first student: "+ S.showRollnumber());  
//passing the parameters to the copy constructor  
School s2 = new School(S);  
System.out.println("Name of the student using copy constructor: "+ s2.showName());  
System.out.println("Roll number of the student in copy constructor: "+ s2.showRollnumber());  
}  
}  
