import java.io.FileWriter;
import java.io.IOException;

public class Equation {
    int m,b;

    //constructor
    public Equation(int m, int b){
        this.m=m;
        this.b=b;
    }

    //method returns equation in y=mx+b form
    public String line(){
        String y="y = " + Integer.toString(this.m) + "x + " + Integer.toString(this.b);
        return y;
    }

    //method writes x and y values of f(x) to file
    public Boolean write(int min, int max, String name) {
        try {
            FileWriter file = new FileWriter(name);   
            //start of for loop to add to file
            for (int i = min; i <= max; i++) {
                //calculate y value
                int n = (this.m*i)+this.b;
                //add line to file
                file.write(i + " " + n);
                //add new line
                file.write(System.lineSeparator());
            }             
            file.close();
            //return true;
            return true;
        // Catch the IOException if an error occurs.
        } catch (IOException e) {
            //return false
            return false;
        }
    }
}
