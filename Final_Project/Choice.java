import java.io.*;
import java.util.*;

public class Choice {
    //this function is used if user chooses choice one. The scanner parameter is passed into this function - so that I don't have to create a new scanner
    public static void choiceOne(Scanner sc) throws IOException{
        //initialize conversion
        Conversion conversion=new Conversion();
        //asks user to input string
        System.out.print("Please input your word: ");
        //initializes and inputs string
        String original=sc.nextLine();
        //asks user to input base they want it converted into
        System.out.print("Please input the base you want the ASCII values of the characters in the String converted into (maximum base 10): ");
        //initializes and inputs base
        int base=Integer.parseInt(sc.nextLine());
        //if statement just to make sure base is not above 10
        if(base>10){
            //outputs to user that they annot input a base above 10
            System.out.println("Sorry, you cannot input a base above 10.");
        }
        else{
            //declare file 
            File file = new File(System.getProperty("user.dir") + "/Final_Project/ASCII.txt");
            //create scanner to read from file "ASCII.txt"
            Scanner read=new Scanner(file);
            //initializing 2 arrays - one will hold the characters(will have 52 as there is one of each letter upper and lower case), and the other will hold their ASCII values(52 also)
            int ASCII[]=new int[52];
            char chars[]=new char[52];
            //for loop takes input for the ASCII array
            for(int i=0; i<52; i++){
                //just puts the input in the ith place
                ASCII[i]=Integer.parseInt(read.nextLine());
            }
            //for loop takes input for the chars array
            for(int i=0; i<52; i++){
                //just puts the input in the ith place
                chars[i]=read.nextLine().charAt(0);
            }
            //closing the scanner
            read.close();
            //initializing integer with size of original string
            int size=original.length();
            //makes an array of size of word to store the number values of the characters inside of it
            int word[]=new int[size];
            //pass the array that was just initialized into this function - it will fill the array with the ASCII values, and also pass the ASCII and chars arrays and the size int and the original string as they will be needed
            conversion.stringToASCII(word, ASCII, chars, size, original);
            //initialize the new string that will be composed of ASCII characters in a different base
            String New="";
            //pass the word array and the size and the base variable into the decimal to base function and the New string will be what is returned from that function
            New=conversion.decimalToBase(word,size, base, New);
            //output the users final result
            System.out.println(original + " in base " + base + " is: \"" + New + "\"");
        }
    }
    
    //this function gets called if the user chooses choice 2. the scanner parameter is passed into this function - so that I don't have to create a new scanner
    public static void choiceTwo(Scanner sc) throws IOException{
        //initialize conversion
        Conversion conversion=new Conversion();
        //asks user to input number
        System.out.print("Please input your number of choice (max base 10): ");
        //declare and set value to userNum int
        int userNum=Integer.parseInt(sc.nextLine());
        //ask the user which base the number was in
        System.out.print("Please input what base your number of choice is in (no greater than base 10): ");
        //declare and set value to userBase int
        int userBase=Integer.parseInt(sc.nextLine());
        //declare and set value to a new int called userDecimal using this function that just converts the number to base 10
        int userDecimal=conversion.toBaseTen(userNum, userBase);
        //ask user which base they would like the number to be changed into
        System.out.print("Please indicate which base you would like the " + userNum + " to be converted into (no greater than base 10): ");
        //input the user preference
        int base=Integer.parseInt(sc.nextLine());
        //declare and set value of newNum to whatever the decimalToOther function returns
        int newNum=conversion.decimalToOther(userDecimal, base);
        //print out to the user the final result
        System.out.println("Here is " + userNum + " from base " + userBase + " to base " + base + ": " + newNum);
    }
    
    //this function gets called if the user chooses choice 3. The scanner parameter is passed into this function - so that I don't have to create a new scanner
    public static void choiceThree(Scanner sc) throws IOException{
        //initialize conversion
        Conversion conversion=new Conversion();
        //asks user to input string
        System.out.print("Please input your word: ");
        //initializes and inputs string
        String original=sc.nextLine();
        //declare file 
        File file = new File(System.getProperty("user.dir") + "/Final_Project/ASCII.txt");
        //create scanner to read from file "ASCII.txt"
        Scanner read=new Scanner(file);
        //initializing 2 arrays - one will hold the characters(will have 52 as there is one of each letter upper and lower case), and the other will hold their ASCII values(52 also)
        int ASCII[]=new int[52];
        char chars[]=new char[52];
        //for loop takes input for the ASCII array
        for(int i=0; i<52; i++){
            //just puts the input in the ith place
            ASCII[i]=Integer.parseInt(read.nextLine());
        }
        //for loop takes input for the chars array
        for(int i=0; i<52; i++){
            //just puts the input in the ith place
            chars[i]=read.nextLine().charAt(0);
        }
        //closing the scanner
        read.close();
        //initializing integer with size of original string
        int size=original.length();
        //makes an array of size of word to store the number values of the characters inside of it
        int word[]=new int[size];
        //pass the array that was just initialized into this function - it will fill the array with the ASCII values, and also pass the ASCII and chars arrays and the size int and the original string as they will be needed
        conversion.stringToASCII(word, ASCII, chars, size, original);
        //pass the array word[] into the sorter
        conversion.sorter(word, size);
        //beginning of output
        System.out.println("Here is " + original + " in it's ASCII values and sorted: ");
        //outputs all of the word array that was sorted
        for(int i=0; i<size; i++){
            System.out.println(word[i]);
        }
    }
}
