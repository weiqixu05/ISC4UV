public class Conversion {
    //this function turns each character in the original string to it's ASCII values in base 10
    public static void stringToASCII(int word[], int ASCII[], char chars[], int size, String original){
        //the for loop iterates over every element of the string and inserts its ASCII value into the word array
        for(int i=0; i<size; i++){
            //for loop goes over each element of the chars array until it finds a match
            for(int j=0; j<52; j++){
                //if statement just compares the ith element of the original string to the jth element of the char array
                if((original.charAt(i))==chars[j]){
                    //if it's true the int at index j of the ASCII array is the ASCII value of the character at index i of original
                    word[i]=ASCII[j];
                    //just prevents more iterations of this loop from happening as it is unneeded
                    continue;
                }
            }
        }
    }
    
    //this function just takes in the word array and transforms it into it's new base
    public static String decimalToBase(int word[], int size, int base, String New){
        //initializing new temporary string that will hold the individual ASCII value of the new base in the selected iteration
        String temp="";
        //for loop iterates over every element in word array and turns it into the new base
        for(int i=0; i<size; i++){
            //in order the get the number from decimal to a different base
            int j=word[i];
            while(j>0){
                //set a temporary int and take it's modulus - this is just the algorithm to get any base from decimal
                int addTo=j%base;
                //appending the addTo to the temp string
                temp=Integer.toString(addTo)+temp;
                //just another step in the algorithm - dividing j by the base
                j/=base;
            }
            //add the temp string to the New string
            New=New+temp+" ";
            //reset temp to be empty
            temp="";
        }
        //delete last space from string
        New=New.substring(0,New.length()-1);
        //returns the new string
        return New;
    }
    
    //this function just returns the user inputted number in base 10(decimal)
    public static int toBaseTen(int userNum, int userBase){
        //declare new int called total
        int total=0;
        //declare int x with value of userNum
        int x=userNum;
        //declare power value to keep track of power
        int power=0;
        //while loop for while x>0
        while(x>0){
            //declare temp int to hold modulus value
            int temp=x%10;
            //declare new int powerTimesBase
            int powerTimesBase=(int)Math.pow(userBase,power);
            //add to total in decimal by multiplying the temp value times the base to the power value
            total+=temp*powerTimesBase;
            //divide x by 10
            x/=10;
            //add one to the power
            power++;
        }
        return total;
    }
    
    //this function converts a number from decimal to any other base(that's less than or equal to 10)
    public static int decimalToOther(int userDecimal, int base){
        //set up int j as userDecimal
        int j=userDecimal;
        //declare total int
        int total=0;
        //declare power int
        int power=0;
        //while loop just makes it into the base of the user's choosing
        while(j>0){
            //set a temporary int and take it's modulus - this is just the algorithm to get any base from decimal
            int addTo=j%base;
            //declare new int powerTimesTen
            int powerTimesTen=(int)Math.pow(10,power);
            //add addTo times power times 10 to total 
            total+=powerTimesTen*addTo;
            //just another step in the algorithm - dividing j by the base
            j/=base;
            //add one to power
            power++;
        }
        return total;
    }
    
    //this function sorts the elements inside of an array
    public static void sorter(int word[], int size){
        //start bubble sort
        for(int i=size; i>0; i--){
            for(int j=0; j<i-1; j++){
                //compare the 2 elements
                if(word[j]>word[j+1]){
                    //if the if staetment is true, then swap the numbers
                    //declare a temporary int;
                    int temp=word[j+1];
                    //swap the numbers
                    word[j+1]=word[j];
                    word[j]=temp;
                }
            }
        }
    }
}
