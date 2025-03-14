package oops3_Inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }


    public BoxWeight(double l, double h, double w, double wt){
        super(l,h,w);  //// call the parent class constructor.
//        //// Used to initialize the values in present in parent class.
        this.weight = wt;
    }


    BoxWeight(BoxWeight other){
        super(other);  //// other has access to all the stuffs of its parents.
        weight = other.weight;
    }


    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }
}
