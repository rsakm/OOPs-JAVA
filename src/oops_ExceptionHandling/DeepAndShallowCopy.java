package oops_ExceptionHandling;

public class DeepAndShallowCopy implements Cloneable {
    int[] arr;

    public DeepAndShallowCopy(){
        this.arr = new int[]{2,4,6,8};
    }

//    public Object clone() throws CloneNotSupportedException{
////       // this is shallow copy
//        return super.clone();
//
//    }


    public Object clone() throws CloneNotSupportedException{
//       // this is deep copy
        DeepAndShallowCopy copy = (DeepAndShallowCopy) super.clone();  //// thsi is shallow copy
//// make a deep copy
        copy.arr = new int[copy.arr.length];
        for (int i =0; i<copy.arr.length;i++){
            copy.arr[i] = this.arr[i];
        }
        return copy;

    }
}
