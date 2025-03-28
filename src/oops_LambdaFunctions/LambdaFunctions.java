package oops_LambdaFunctions;

import java.util.ArrayList;

public class LambdaFunctions {
    public static void main(String[] args) {

//        int[] arr = {3,4,5,6,7};

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i = 0;i<5;i++){
            arr.add(i+1);
        }

        arr.forEach((item)->System.out.println(item*2));

        Operation sum = (a,b)->a+b;
        Operation product = (a,b)->a*b;
        Operation div = (a,b)->a/b;
        Operation remainder = (a,b)->a%b;

System.out.println("***************************************");
        LambdaFunctions calc = new LambdaFunctions();
        System.out.println(calc.operate(6,8,sum));

    }

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation{
    int operation(int a, int b);

}
