//input scanner class
import java.util.Scanner;

public class U2_1_2_A2 {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user to input number
        System.out.print("Type a positive integer (no commas): ");
        //initialize and input number
        String number=sc.nextLine();
        //check if the number has a period or negativ
        if(number.indexOf(".")!=-1||number.indexOf("-")!=-1){
            //if it isn't a number, say it's invalid
            System.out.println(number + " is an invalid input.");
        }
        else{
            //if it is a number
            //convert number to an integer, n
            int n=Integer.parseInt(number);
            //find square root of n
            double root=Math.sqrt(n);
            //output number and root
            System.out.print("The square root of " + number + " is " + String.format("%.2f", root));
        }
		}
	}
