import java.util.Scanner;
public class reading {
    public static void main(String args[])
    {
        System.out.println("accepting user inputs");
        Scanner sc= new Scanner(System.in);
        System.out.println("ENTER A INTEGER VALUE :");
        int ip1=sc.nextInt();

        System.out.println("ENTER A FLOAT VALUE :");
        float ip2=sc.nextFloat();

        System.out.println("ENTER A STRING :");
        String ip3=sc.next();

        System.out.println("ENTER A COLLECTION OF STRINGS :");
        sc.nextLine();
        String ip4=sc.nextLine();

        System.out.println("THE INTEGER IS :"+ip1);
        System.out.println("THE FLOAT IS :"+ip2);
        System.out.println("THE STRING IS : "+ip3);
        System.out.println("THE STRINGS ARE : "+ip4);

        sc.close();


    }
    
}
