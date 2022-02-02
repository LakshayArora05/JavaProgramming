class StudentRecord
{ 
int rollno; 
String name; 
int marks1; 
int marks2; 
int marks3; 
public void getdata(int rn, String nam, int mar1, int mar2 , int 
mar3) 
{ 
rollno=rn; 
name=nam; 
marks1=mar1; 
marks2=mar2; 
marks3=mar3; 
} 
public void display() 
{ 
System.out.println("Roll No :" +rollno); 
System.out.println("Name : " +name); 
System.out.println("Marks 1 :"+marks1); 
System.out.println("Marks 2 :"+marks2); 
System.out.println("Marks 3 :"+marks3); 
} 
} 
class Final
{ 
public static void main(String args[]) 
{ 
StudentRecord r=new StudentRecord(); 
r.getdata(271,"Lakshay",65,66,76); 
r.display(); 
} 
} 
