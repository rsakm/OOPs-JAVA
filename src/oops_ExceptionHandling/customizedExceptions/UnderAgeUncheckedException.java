package oops_ExceptionHandling.customizedExceptions;

import java.util.Scanner;

public class UnderAgeUncheckedException extends RuntimeException{

    UnderAgeUncheckedException(){
        super("You are under age!!");
    }

    UnderAgeUncheckedException(String msg){
        super(msg);
    }
}

class Vote{
    public static void main(String[] args) {

        System.out.print("Enter your age: ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        try {
            if(age < 18){
                throw new UnderAgeUncheckedException();
            }else{
                System.out.println("You can vote now!!");
            }
        }catch (UnderAgeUncheckedException e){
            e.printStackTrace();
        }
    }
}
