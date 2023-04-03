//input scanner class
import java.util.Scanner;

public class U2_3_4_A1 {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user how many grades they will enter
        System.out.print("Enter the number of grades being entered: ");
        //initialize number of grades variable
        int n=sc.nextInt();
        //declare array of size n
        double[] grades=new double[n];
        //initialize sum variable
        double sum=0;
        //initialize lowest variable and set to 101 to first grade inputted will be lower
        double lowest=101;
        //use for loop to input each grade
        for(int i=0;i<n;i++){
            //ask user to input the i+1th grade
            System.out.print("Enter grade " + (i+1) + ": ");
            //input the grade value and store in grades array
            grades[i]=sc.nextDouble();
            //add grade to sum
            sum+=grades[i];
            //check if grade is lowest
            if(grades[i]<lowest){
                //sets lowest to the current grade if it is the lowest
                lowest=grades[i];
            }
        }
        //initialize average variable
        double average=sum/n;
        //output grades
        System.out.print("Grades you have entered: ");
        //output the grades entered using a for loop
        for(int i=0;i<n;i++){
            System.out.printf("%.2f ", grades[i]);
        }
        //output average grade
        System.out.printf("%n%s%.2f%n","Average of the grades: ", average);
        //output lowest grade
        System.out.printf("%s%.2f", "Lowest grade: ", lowest);
		}
	}
