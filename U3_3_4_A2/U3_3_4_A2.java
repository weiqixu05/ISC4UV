//input scanner class
import java.util.Scanner;

public class U3_3_4_A2 {
    //start of main function
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        //initialize 2 instances of parcel
        Parcel firstParcel=new Parcel();
        Parcel secondParcel=new Parcel("tv", 600);
        //set values to objects in firstParcel
        firstParcel.name="plant";
        firstParcel.price=20;
        //output header for output
        System.out.printf("%-10s%10s\n", "Parcel", "Price");
        //output firstParcel
        System.out.printf("%-10s%10s\n", firstParcel.name, firstParcel.decrease(10));
        //output secondParcel
        System.out.printf("%-10s%10s", secondParcel.name, secondParcel.decrease(10));
		}
	}
