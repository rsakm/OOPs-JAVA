package oops_ExceptionHandling;

import java.util.Arrays;

public class CopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepAndShallowCopy obj = new DeepAndShallowCopy();

        DeepAndShallowCopy copy = (DeepAndShallowCopy)obj.clone();
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(copy.arr));

        copy.arr[0] = 64;
        System.out.println(Arrays.toString(obj.arr));
        System.out.println(Arrays.toString(copy.arr));
    }
}
