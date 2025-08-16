import java.util.Scanner;

class Calculator {

    public static void main(String[] args)
    {
        //System.out.println("SUm of two number ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc =new Scanner(System.in);
        int m = sc.nextInt();
        sum(n,m);
        divide(n,m);
        multiply(n, m);


    }
    public static void divide(int x,int y)
    {
        double d = x/y;
        System.out.println(d);
    }
    public static void multiply(int x,int y)
    {
        Long d =(long) x*y;
        System.out.println(d);
    }
    public static void reminder(int x,int y)
    {
        System.out.println(x%y);
    }
    public static void sum(int x,int y)
    {
        System.out.println(x+y);
    }
   
}