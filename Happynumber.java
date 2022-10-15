import java.util.Scanner;
class happynumber{
    static boolean happyNumber(int n)
    {
        while(n>9)
        {
            int sum=0;
            while(n!=0)
        {
            int rem=n%10;
            sum=sum+rem*rem;
            n=n/10;
        }
        n=sum;
    }
    return n==1||n==7;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(happyNumber(n));
    }
}