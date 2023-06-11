//Weiqi Xu, 6/10/2023
/*
This program is a base changer. It will have 3 options 
Option 1)Convert the user inputted word from it's characters into any base's(less than or equal to 10) in it's ASCII value 
Option 2)Convert the user inputted number(that can be in any base) into another base(any other base of the users choosing)(with ever base having to be lesser than or equal to 10)
Option 3) Convert the word to base 10 ASCII values and sort the output
*/

import java.io.*;
import java.util.*;

public class FinalProject{
    public static void main(String args[]) throws IOException{
        Scanner sc=new Scanner(System.in);
        //Introduces user to the program
        System.out.println("Hello, welcome to the Base Changer.");
        //initialize instance of choice
        Choice choice=new Choice();
        //encapsulate program
        while(true){
            //tells user choices
            System.out.print("Here's a list of your options: \n\n1. Input a word and return it's ASCII values in a base of your choice. \n2. Input a number (of a base of your choosing), and output it (in a base of your choosing).\n3. Convert a word to base 10 ASCII values and sort the output from least to greatest.\n");
            //asks user to enter choice number
            System.out.print("Please enter your choice number: ");
            //declares and gets value for choice variable
            int choiceNumber=Integer.parseInt(sc.nextLine());
            //if choice is 1(convert word to base)
            if(choiceNumber==1){
                choice.choiceOne(sc);
            }
            //if choice is 2(convert number into any base)
            else if(choiceNumber==2){
                choice.choiceTwo(sc);
            }
            //if choice is 3(convert word to base 10 ASCII values and sorts the output)
            else if(choiceNumber==3){
                choice.choiceThree(sc);
            }
            //if choice was invalid
            else{
                System.out.println("Input was invalid.");
            }
            //ask user if they would like to continue
            System.out.print("Type yes if you would like to continue and anything else if you would like to exit the program: ");
            String cont=sc.nextLine();
            //if statement determines whether to continue
            if(cont.equals("yes")){
                continue;
            }
            else{break;}
        }
        //thank user for using program
        System.out.println("Thank you for using this program. Program will now close.");
    }
}

