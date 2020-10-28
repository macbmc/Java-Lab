import java.util.*;
class Pallindrome
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int r,sum=0,a;
        a=n;
        while(n!=0)
        {
         r=n%10; 
         sum=sum*10+r;    
         n=n/10; 
        }
        if(a==sum)
        {
            System.out.println("Pallindrome");
        }
        else
        {
            System.out.println("Not Pallindrome");
        }
    }
}
            
     