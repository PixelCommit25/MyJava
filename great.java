/*wAP that reads 2 integer from the user and displays if the the first no. is greater 
than the second (T ot F) and whether the second number is greater than the first 
number (T or F) use boolean var and dispaly the result*/

import java.util.Scanner;
public class great {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE FIRST NUMBER :");
        int d1 = sc.nextInt();
        System.out.println("ENTER THE SECOND NUMBER :");
        int d2 = sc.nextInt();
        if (d1 == d2)
            System.out.println("THE NUMBERS ARE EQUAL");
        else {
            boolean b1 = d1 > d2;
            boolean b2 = d2 > d1;
            System.out.println("THE FIRST NUMBER " + d1 + " IS GREATER THAN THE SECOND NUMBER " + d2 + " :" + b1);
            System.out.println("THE SECOND NUMBER " + d2 + " IS GREATER THAN THE FIRST NUMBER " + d1 + " :" + b2);
        }
        sc.close();
    }

}
