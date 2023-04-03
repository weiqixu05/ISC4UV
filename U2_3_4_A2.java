//input scanner class
import java.util.Scanner;

public class U2_3_4_A2 {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //initialize 2d array with questions, choices, and answers. format: (question, option 1, option 2, option 3, correct letter of answer, correct answer content)
        String[][] questions={{"What year was Apple Computers founded?", "a) 1984", "b) 1976", "c) 1978", "b", "1976"}, {"In what year was Ludwig van Beethoven born?", "a) 1770", "b) 1776", "c) 1827", "a", "1770"}, {"What is the capital of Kazakhstan?", "a) Astana", "b) Nur-Sultan", "c) Almaty", "a", "Astana"}, {"What is the length of the Great Wall of China?", "a) 19,785 km", "b) 31,364 km", "c) 21,196 km", "c", "21,196 km"}};
        //declare variable n and give it a randomly assigned number between 0-3
        int n=(int)Math.floor(Math.random()*4);
        //output question
        System.out.println("Question: " + questions[n][0]);
        //output options using for loop
        for(int i=1;i<4;i++){
            System.out.println("\t" + questions[n][i]);
        }
        //ask user for answer input
        System.out.print("Answer: ");
        //initialize answer variable
        String answer=sc.nextLine();
        //check if answer is right
        if(answer.equals(questions[n][4])){
            //output answer is correct
            System.out.println("That is correct. Very good!");
        }
        else{
            //output answer is incorrect
            System.out.println("That is incorrect, the answer was " + questions[n][5]);
        }
		}
	}
