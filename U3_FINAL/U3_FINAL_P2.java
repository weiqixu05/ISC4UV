//input scanner class
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class U3_FINAL_P2 {
    //start of main function
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user what file they want to open
        System.out.print("Enter the file you want to open: ");
        //input name of file user would like to open
        String name=sc.nextLine();
        try{
            //create new instance of file
            File file=new File(name);
            //create scanner for file
            Scanner read=new Scanner(file);
            //output x and y header
            System.out.printf("%5s%5s\n", "x", "y");
            //keep count for while loop
            int count=1;
            //while loop prints as long as there are more int tokens to read
            while (read.hasNextInt()) {
                //read next int
                System.out.printf("%5d ", read.nextInt());
                //print new line at 2.
                if (count % 2 == 0){
                    System.out.println("");
                }
                count++;
            }
            read.close();
            //ask user whether or not they want to delete the file
            System.out.print("Do you want to delete the file (y/n)? ");
            //take input
            String option=sc.nextLine();
            //if user wants to delete file
            if(option.equals("y")){
                //delete file
                file.delete();
                //tell user file is deleted
                System.out.println("File is deleted.");
            }

        } catch (FileNotFoundException e) {
            //file doesn't exist
            System.out.println("File does not exist.");
            e.printStackTrace();
        }
        }
	}
