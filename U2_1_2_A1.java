//input scanner class
import java.util.Scanner;

public class U2_1_2_A1 {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user to input radius
        System.out.print("Enter the radius: ");
        //initialize radius variable and input it
        double r=sc.nextDouble();
        //initialize volume variable
        double V=(4*Math.PI*Math.pow(r,3))/3;
        //initialize surface area variable
        double SA=4*Math.PI*Math.pow(r,2);
        //output new line
        System.out.print("\n");
        //output radius, volume, and surface area strings
        System.out.printf("%-10s%10s%20s\n", "Radius", "Volume", "Surface Area");
        //output radius, volume, and surface area values
        System.out.printf("%6.1f%14.2f%20.2f", r,V,SA);
		}
	}
