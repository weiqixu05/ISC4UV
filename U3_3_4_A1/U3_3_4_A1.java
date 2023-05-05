//input scanner class
import java.util.Scanner;

public class U3_3_4_A1 {
    public static void main(String args[]){
        //initialize scanner
		Scanner sc = new Scanner(System.in);
        //ask user how many items they would like to enter
        System.out.print("How many items do you want to enter? ");
        //input number
        int n=sc.nextInt();
        //initialize item class
        Item[] item=new Item[n];
        //start of for loop to input information
        for(int i=0;i<n;i++){
            //create item object for ith loop
            item[i]=new Item();
            //ask user to input the name of the i+1 item
            System.out.print("Enter the name of item " + (i+1) + ": ");
            //input name
            sc.nextLine();
            item[i].name=sc.nextLine();
            //ask user to input the weight
            System.out.print("Enter the weight of item " + (i+1)+ ": ");
            //input weight
            item[i].weight=sc.nextInt();
        } //end of for loop
        //output table header
        System.out.printf("%-15s%8s\n", "Item", "Weight");
        //start of for loop to output information
        for(int i=0;i<n;i++){
            System.out.printf("%-15s%8s\n", item[i].name, item[i].weight);
        }
    }
}
