package Numbers;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int rev=0;
        int t=n;
        
        while(n>0){
            int d =n%10;
            rev=rev*10+d;
            n=n/10;
        }
        if(t==rev)
        System.out.println("palindrome no");
        else 
        System.out.println("not palindrome");
    }
}
