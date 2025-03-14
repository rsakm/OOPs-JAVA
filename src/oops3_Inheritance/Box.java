package oops3_Inheritance;

public class Box {
    double length;
    double height;
    double width;

    Box(){
        this.length = -1;
        this.height= -1;
        this.width = -1;
    }

//    // cube
    Box(double side){
        this.length = side;
        this.height = side;
        this.width = side;
    }

//    // cuboid
    Box(double l, double h, double w){
        this.length = l;
        this.height = h;
        this.width = w;
    }

//    // Copy constructor
    Box(Box b){
        this.length = b.length;
        this.height = b.height;
        this.width = b.width;
    }

    public void information(){
        System.out.println("Informing from the Box class...!");
    }
}
