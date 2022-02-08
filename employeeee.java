mport java.util.Scanner;

class employee
{
    int no;
    String name;
    Scanner sc= new Scanner(System.in);
    
    void input()
    {
       System.out.println("Enter Name:");
       name= sc.next();
       System.out.println("Enter Id:");
       no= sc.nextInt();
    }
    
      void output()
    {
        System.out.println("Name:"+ name);
        System.out.println("Id:"+ no);
    }
}

class programmer extends employee
{
    int sal= 5000;
    int sal1()
    {
        System.out.println("SALARY:"+ sal);
        return sal;
    }
    
}

class analyst extends employee
{
    int sal2()
    {
       int sal2= 10000;
       System.out.println("SALARY:"+ sal2);
       return sal2;
    }
}

class project_leader extends employee
{
    int sal3()
    {
       int sal3= 15000;
       System.out.println("SALARY:"+ sal3);
       return sal3;
    }
}

public class Main
{
	public static void main(String[] args) {
	   
		employee e = new employee();
		e.input();
		e.output();
		programmer p= new programmer();
		p.sal1();
		analyst a= new analyst();
		a.sal2();
		project_leader l= new project_leader();
		l.sal3();
		
	}
}