import java.util.Scanner;
public class SumandAverage
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        float average;
        Scanner scan = new Scanner(System.in);
        //System.out.println("Program to print sum and average of an array[LabQ1:1.02.22]");

        
        System.out.print("Enter no. of elements in array:");
        n = scan.nextInt();
        
        int array1[] = new int[n];
        
        System.out.println("Enter the elements:");
        for(int i = 0; i < n ; i++)
        
        {
            array1[i] = scan.nextInt();
            sum = sum + array1[i];
        }
        
        System.out.println("Sum of numbers:"+sum);
        average = (float)sum / n;
        System.out.println("Average of numbers:"+average);
    }
}
