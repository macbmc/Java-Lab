import java.util.*;
class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the series limit");
        int n =sc.nextInt();
        int c,a=0,b=1;
        System.out.print(a+" "+b);
        for (int i = 2; i < n; i++)
        {
             c=a+b;    
             System.out.print(" "+c);    
             a=b;    
             b=c; 
            }
        }
    }
    
            

             
        