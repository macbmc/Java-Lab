import java.util.*;
class Armstrong
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n =sc.nextInt();
        int a,c=0,b;
        b=n;
        while(n>0)  
    {  
          a=n%10;  
          n=n/10;  
          c=c+(a*a*a);  
    } 
    if(b==c)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }
    }
}
   