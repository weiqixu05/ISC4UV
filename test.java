//input scanner class
import java.util.Scanner;

public class test {
	public static void main (String args[]){
		//initialize scanner
		Scanner sc = new Scanner(System.in);
        int n=(int)Math.random()*3;
		for(int i=0;i<100;i++){
			System.out.println(n);
			n=(int)Math.floor(Math.random()*4);
		}
		}
	}
