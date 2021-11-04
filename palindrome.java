import java.util.*;
public class palindrome {
public static void main(String[] args){
    
            int n,sum=0,r,temp;
        Scanner sh=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sh.nextInt();
                temp=n;

        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }

        if(temp==sum)
        {
            System.out.println("The number is palindrome");
        }
        else
        {
            System.out.println("The number is not palindrome");
        }
    }
    }