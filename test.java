//input scanner class
import java.util.Scanner;

public class test {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
		String Hello="hello";
		String name="weiqi";
        System.out.printf("%-15s%10s%10s%10s\n", "Name", "Unit 1", "Unit 2", "Average");
		String intro=Hello+" "+name;
		System.out.print(intro);
		}
	}
