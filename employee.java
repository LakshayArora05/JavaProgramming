class salary 
{ 
String name; 
int emp_id; 
String desig; 
float salary; 
void getdata(String nam , int no, String des, float sal) 
{ 
String name=nam; 
int emp_id=no; 
String desig=des; 
float salary=sal; 
} 
float inc_sal(String des,int s) 
{ 
if (des=="Manager") 
s=s+5000; 
else if(des=="GeneralManager") 
s=s+10000; 
else if(des=="CEO") 
s=s+20000; 
else if(des=="Worker") 
s=s+2000; 
return s; 
} 
void putdata(String n,int num,String d,float sal) 
{ 
System.out.println("Name: "+n); 
System.out.println("Employee id "+num); 
System.out.println("Designation"+d); 
System.out.println("Incremented salary "+sal); 
} 
} 
class employee 
{ 
public static void main(String args[]) 
{ 
salary s1=new salary(); 
s1.getdata("Sugandha",1234,"CEO",8900) ;
float insal=s1.inc_sal("CEO",8900); 
s1.putdata("Sugandha",1234,"CEO",insal); 
} 
}
