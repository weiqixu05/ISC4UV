//input scanner class
import java.util.Scanner;

public class U3_1_2_A1 {
    //method generates random integers from 1 to 10
    static void generate(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int)(Math.random()*10 + 1);
        }
    }

    //Method to display the random numbers in the array being passed.
    static void display(int[] numbers){
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    //method to swap the 2 positions requested (if possible)
    static boolean swap(int[] numbers, int a, int b){
        //checks if the positions they want to swap are between 1 and 10
        if((a<=10&&a>=1)&&(b<=10&&b>=1)){
            //if the numbers are between 1-10, swap
            int temp=numbers[a-1];
            numbers[a-1]=numbers[b-1];
            numbers[b-1]=temp;
            return true;
        }
        else{
            //if one or both of the numbers are out of the range of 1-10
            return false;
        }
    }

    //method to shuffle the array
    static void shuffle(int[] numbers) {
        //start of for loop to loop through array
        for(int i=0;i<numbers.length;i++){
            //generate a random number between 0-9
            int rand=(int)(Math.random()*10);
            //use swap function to swap number[i] with number[rand]
            swap(numbers, i, rand);
        }
    }
    //start of main function
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        
        String option = "0";
        while(true){
            System.out.println("1) Generate");
            System.out.println("2) Display");
            System.out.println("3) Swap");
            System.out.println("4) Shuffle");
            System.out.println("5) Quit");
            System.out.print("Choose one of the options: ");
            option = sc.next();


            if (option.equals("1")){
                generate(numbers);
                System.out.println("The numbers have been generated.");
            }
            else if (option.equals("2")){
                System.out.println("Here are the ten random numbers: ");
                display(numbers);
                System.out.println("");
            }
            else if(option.equals("3")){
                System.out.println("Which 2 positions do you want to swap?");
                int a=sc.nextInt();
                int b=sc.nextInt();
                boolean valid=swap(numbers, a, b);
                //determines whether to print whether swap was successful or not
                if(valid){
                    System.out.println("Swap completed successfully.");
                }
                else{
                    System.out.println("Swap failed.");
                }
            }
            else if(option.equals("4")){
                shuffle(numbers);
                System.out.println("The array has been shuffled.");
            }
            else if(option.equals("5")){
                System.out.println("Exiting program.");
                break;
            }
            else {
                System.out.println("Invalid input.");
            }
        }

		}
	}
