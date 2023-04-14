//input scanner class
import java.util.Scanner;
import java.util.Arrays;

public class U2_FINAL {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //Part a: inputting name and grades
        //ask user how many students they have
        System.out.print("How many students do you have? ");
        //initialize variable for number of students
        int n=sc.nextInt();
        //read nextLine() as the enter will be in the reading stream
        sc.nextLine();
        //declare arrays for name and grade
        double[][] grade=new double[n][2];
        String[][] name=new String[n][2];
        //ask user to enter input in correct order
        System.out.println("Please enter the information in the correct order: first, last, U1 grade, U2 grade");
        //for loop for inputting names and grades
        for(int i=0;i<n;i++){
            //ask user to input information for the i+1th student
            System.out.println("Enter information for student " + (i+1));
            //initialize string as input
            String input=sc.nextLine();
            //initialize size variable for string
            int size=input.length();
            //initialize prev variable to keep track of where the previous comma was
            int prev=-1;
            //initialize count variable to determine whether it's a name or a grade
            int count=0;
            //for loop will loop through the string to find where the commas are and enter information into proper arrays
            for(int j=0;j<size;j++){
                if(input.charAt(j) ==','){
                    //initialize substring
                    String substr=input.substring(prev+1,j);
                    //trim substring to get rid of leading and trailing spaces
                    substr=substr.trim();
                    //if statement determines what to do based off of the value of count variable
                    if(count==0){
                        //assign first name
                        name[i][0]=substr;
                        //increase count
                        count++;
                        //update prev variable
                        prev=j;
                        continue;
                    }
                    else if(count==1){
                        //assign last name
                        name[i][1]=substr;
                        //increase count
                        count++;
                        //update prev variable
                        prev=j;
                        continue;
                    }
                    else if(count==2){
                        //parse string into double and put it into grade array as first grade
                        grade[i][0]=Double.parseDouble(substr);
                        //no need to increase count;
                        //update prev variable
                        prev=j;
                    }
                }
                //if we are on the last iteration
                if(j==size-1){
                    //initialize substring
                    String substr=input.substring(prev+1);
                    //trim substring to remove leading and trailing spaces
                    substr=substr.trim();
                    //parse string into double and put it into grade array as the second array
                    grade[i][1]=Double.parseDouble(substr);
                }
            }
        } //end of for loop inputting name and grade
        //output new line to separate part a and b
        System.out.print("\n");
        //part b: printing names, grades, and averages
        //declare average array
        double[] average=new double[n];
        //start of for loop calculating averages
        for(int i=0;i<n;i++){
            //calculate average and store in array;
            average[i]=(grade[i][0]+grade[i][1])/2;
        }
        //output header for output
        System.out.printf("%-20s%10s%10s%10s\n", "Name", "Unit 1", "Unit 2", "Average");
        // start of for loop that outputs names, grades, and averages
        for(int i=0;i<n;i++){
            //concatenate first and last name into one string
            String fullName=name[i][0]+" "+name[i][1];
            //output name, grades and average for student
            System.out.printf("%-20s%10.1f%10.1f%10.1f\n", fullName, grade[i][0], grade[i][1], average[i]);
        } //end of for loop that outputs names, grades, and averages
        //output new line to separate part b and c
        System.out.print("\n");
        //part c - output average and median grades
        //initialize sum variable
        double sum=0;
        //use for loop to add up grades
        for(int i=0;i<n;i++){
            sum+=average[i];
        }
        //output class average
        System.out.printf("%s%.1f\n", "Class average: ", sum/n);
        //sort average array
        Arrays.sort(average);
        //determine median based on whether or not there's an even or odd number of grades
        if(n%2==0){
            double median=(average[n/2]+average[(n/2)-1])/2;
            System.out.printf("%s%.1f\n", "Class Median: ", median);
        }
        else{
            System.out.printf("%s%.1f\n", "Class Median: ", average[n/2]);
        }
        //output new line to separate part c and d
        System.out.print("\n");
        //part d - determine student with highest and lowest grades
        //initialize variables that hold previous values
        double prevHigh=-1;
        double prevLow=101;
        //initialize variables for unit, and student number
        int unitHigh=-1, unitLow=-1, studentHigh=-1, studentLow=-1;
        //start for loop that checks for highest and lowest grades
        for(int i=0;i<n;i++){
            //for loop that checks first or second grade
            for(int j=0;j<2;j++){
                //check if grade is highest
                if(grade[i][j]>prevHigh){
                    //change variables accordingly
                    prevHigh=grade[i][j];
                    unitHigh=j;
                    studentHigh=i;
                }
                //check if grade is lowest
                if(grade[i][j]<prevLow){
                    //change variables accordingly
                    prevLow=grade[i][j];
                    unitLow=j;
                    studentLow=i;
                }
            }
        }
        //output for lowest grade
        System.out.print(name[studentLow][1] + ", " + name[studentLow][0] + " has the lowest grade: ");
        System.out.printf("%.1f", grade[studentLow][unitLow]);
        //determine what unit to output
        if(unitLow==0){
            System.out.print("% (unit 1).\n");
        }
        else{
            System.out.print("% (unit 2).\n");
        }
        //output for highest grade
        System.out.print(name[studentHigh][1] + ", " + name[studentHigh][0] + " has the highest grade: ");
        System.out.printf("%.1f", grade[studentHigh][unitHigh]);
        //determine what unit to output
        if(unitHigh==0){
            System.out.print("% (unit 1).");
        }
        else{
            System.out.print("% (unit 2).");
        }
		}
	}
