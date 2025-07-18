import java.util.Scanner;
public class percentage {
    public static void main(String args[])
    {
        System.out.println("A SIMPLE PROGRAM TO CALCULATE THE PERCENTAGE :");
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE MARKS IN SUBJECT 1 :");
        float i1=sc.nextFloat();
        System.out.println("ENTER THE MARKS IN SUBJECT 2 :");
        float i2=sc.nextFloat();
        System.out.println("ENTER THE MARKS IN SUBJECT 3 :");
        float i3=sc.nextFloat();
        System.out.println("ENTER THE MARKS IN SUBJECT 4 :");
        float i4=sc.nextFloat();
        System.out.println("ENTER THE MARKS IN SUBJECT 5 :");
        float i5=sc.nextFloat();
        float per=(i1+i2+i3+i4+i5)/5;
        System.out.println("THE PERCENTAGE IS :"+per+"%");
        sc.close();

    }
    
}
