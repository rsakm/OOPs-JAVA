package oops3_Inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box();
//
//        Box box1 = new Box(4,7.9,8.6);
//        Box box2 = new Box(box1);
//        System.out.println(box1.width + " "+box1.height);
//
//        BoxWeight box3 = new BoxWeight();
//        BoxWeight box4 = new BoxWeight(2,3,4,8);
//        System.out.println(box3.height +" "+ box3.weight);


        Box box5 = new BoxWeight(2,4,7,9);

////      box5.weight; // We can't access weight even it has been initialized over in the constructor as 9.
        System.out.println(box5.width);

//// There are many variables in both parent an dchild classes.
//// here we are creating a refrence of child to the pARENT CLASS.
//// The child class has an extra variable called boxWeight, which tghe parent class doesn.t know at all.
//// i.e we can't even initialize the variable of child class constructor here.
//// So we can't refrence a parent class object using child as it gives the Incompatible types error.

//        BoxWeight box6 = new Box();


        BoxPrice box7 = new BoxPrice(3,5,28);


    }
}
