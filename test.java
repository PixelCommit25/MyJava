import java.util.Scanner;
public class test {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE FIRSTDOUBLE :");
        double d1=sc.nextDouble();
        System.out.println("ENTER THE second DOUBLE :");
        double d2=sc.nextDouble();
        System.out.println("THE AREA OF THE TRIANGLE IS :"+(0.5*d1*d2)+" units ");
        sc.close();
    }
    
}
