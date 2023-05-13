//input scanner class
import java.util.Scanner;


public class U3_FINAL_P1 {
    //start of main function
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user to input the slope
        System.out.print("Enter the slope: ");
        //input the slope
        int m=sc.nextInt();
        //ask user to input y-intercept
        System.out.print("Enter the y-intercept: ");
        //input the y-intercept
        int b=sc.nextInt();
        //make instance of equation
        Equation equation=new Equation(m,b);
        //output the equation of the line
        System.out.println("The equation on the line is " + equation.line());
        //tell user the step we are on (creating a table of values)
        System.out.println("Create a table of values...");
        //ask user to input min x value
        System.out.print("Enter the min x value: ");
        //input the min value
        int min=sc.nextInt();
        //ask user to input max x calue
        System.out.print("Enter the max x value: ");
        //input the max alue
        int max=sc.nextInt();
        //ask the user to input the file name
        System.out.print("Enter the file name: ");
        sc.nextLine();
        //input the file name
        String name=sc.nextLine();
        //tell user whether or not file was saved successfully or not
        if(equation.write(min,max,name)){
            //tell user the file was saved successfully
            System.out.println("The file was saved successfully.");
        }
        else{
            //tell user the file wasn't saved successfully
            System.out.println("The file was not saved successfully.");
        }
		}
	}
