public class Parcel {
    String name;
    int price;
    //first constructor
    public Parcel(){}
    //second constructor
    public Parcel(String name, int price){
        this.name=name;
        this.price=price;
    }
    //method decreases price by percentage
    public int decrease(int percentage){
        //returns the price minus the percentage deducted
        return price-(price*percentage)/100;
    }
}
