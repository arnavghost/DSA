package Numbers;

import java.util.Scanner;

public class Reverse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int rev=0;
        
        while(n>0){
            int d =n%10;
            rev=rev*10+d;
            n=n/10;
        }
        System.out.println("reverse of a number:"+rev);
    }
}



package Numbers;
import java.util.Scanner;

public class Armstrong{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int n=sc.nextInt();
        int sum=0;
        int t=n;
        
        while(n>0){
            int d =n%10;
            sum=sum+(d*d*d);
            n=n/10;
        }
        if(t==sum)
        System.out.println("armstrong number");
        else 
        System.out.println('not');
    }
}

    }
}