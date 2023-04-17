//input scanner class
import java.util.Scanner;

public class U2_1_2_A2 {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user to input number
        System.out.print("Type a positive integer (no commas): ");
        //initialize and input
        String input=sc.nextLine();
        //initialize variable that stores whether or not the input is a positive integer
        boolean number=true;
        //check if the input is a positive integer
        //declare string to compare with input
        String zeroToNine="0123456789";
        //start of for loop
        for(int i=0;i<input.length();i++){
            //for loop determines whether or not the character at the ith position of the string is an integer
            for(int j=0;j<10;j++){
                //initialize variable that will turn character at jth index of zeroToNine into char c
                char c=zeroToNine.charAt(j);
                //if statement determines character at ith position in the input is equal to char c
                if(c==input.charAt(i)){
                    //break so it moves to next iteration of outside for loop
                    break;
                }
                //checks character at ith position is not a number by exhausting all potential options
                if(j==9&&c!=input.charAt(i)){
                    number=false;
                }
            } //end of for loop
            //determines whether or not more iterations are needed
            if(number==false){
                //stops loop if more iterations aren't needed
                break;
            }
        } //end of for loop
        //it statements determine output based on whether or not the input was a positive integer
        if(number==false){
            //if it isn't a number, say it's invalid
            System.out.println(input + " is an invalid input.");
        }
        else{
            //if it is a number
            //convert number to an integer, n
            int n=Integer.parseInt(input);
            //find square root of n
            double root=Math.sqrt(n);
            //output number and root
            System.out.print("The square root of " + input + " is " + String.format("%.2f", root));
        }
		}
	}
