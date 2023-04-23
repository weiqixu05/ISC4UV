//input scanner class
import java.util.Scanner;

public class U3_1_2_A2 {
    //method converts the alien number to a regular number
    static int alienToRegular(int alien){
        //convert alien number to string
        String alienString=Integer.toString(alien);
        //initialize regular number;
        int regular=0;
        //start of for loop that turns alien number into regular
        for(int i=0;i<alienString.length();i++){
            //initialize temp int
            int temp=alien%10;
            //add temp*6^i to the regular number
            regular+=temp*Math.pow(6,i);
            //divide alien by 10
            alien/=10;
        }
        return regular;
    }

    //method converts a regular number to an alien number
    static int regularToAlien(int regular, int count, int sum){
        //add to sum (alien number)
        sum+=(regular%6)*(int)Math.pow(10,count);
        //divide regular by 6
        regular/=6;
        //if statement determines whether or not to continue
        if(regular==0){
            return sum;
        }
        //increase count
        count++;
        //call back function
        return regularToAlien(regular,count,sum);
    }

    //start of main function
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user to input alien number
        System.out.print("Type an alien number: ");
        //initialize alien number
        int alien=sc.nextInt();
        //output regular number
        System.out.println(alien + " = " + alienToRegular(alien));
        //ask user to input regular number
        System.out.print("Type a regular number: ");
        //initialize regular number
        int regular=sc.nextInt();
        //initialize count and sum variables
        int count=0,sum=0;
        //output alien number
        System.out.println(regular + " = " + regularToAlien(regular,count,sum));
		}
	}
