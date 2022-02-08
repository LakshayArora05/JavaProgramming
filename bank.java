import java.util.Scanner;

class bank
{
    String name;
    String type;
    int ano;
    int bal_amt;
    Scanner sc= new Scanner(System.in);
    
    void getdata()
    {
        System.out.println("Enter the name of holder:");
        name= sc.next();
        System.out.println("Enter type of account:");
        type= sc.next();
        System.out.println("Enter account no:");
        ano= sc.nextInt();
        System.out.println("Enter amount:");
        bal_amt= sc.nextInt();
    }
    
    void deposit()
    {
        System.out.println("Enter the amount you want to deposit:");
        int damt= sc.nextInt();
        bal_amt= bal_amt+ damt;
    }
    
    void withdraw()
    {
        if(bal_amt> 500)
        {
            System.out.println("Enter amount to be withdrawn:");
            int wamt= sc.nextInt();
            if(bal_amt> wamt)
            {
              bal_amt= bal_amt - wamt;
              //System.out.println("BALANCE:" + bal_amt);
            }
        }
        
        else
        {
            System.out.println("unable to withdraw coz less than 500");
        }
    }
    
    void display()
    {
        System.out.println("NAME:"+ name);
        System.out.println("BALANCE:"+ bal_amt);
    }
}

public class Main
{
	public static void main(String[] args) {
	   
		bank b = new bank();
		b.getdata();
		b.deposit();
		b.withdraw();
		b.display();
		
	}
}
