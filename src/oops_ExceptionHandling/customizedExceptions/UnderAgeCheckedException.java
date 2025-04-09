package oops_ExceptionHandling.customizedExceptions;

import java.util.Scanner;

public class UnderAgeCheckedException extends Exception{

    UnderAgeCheckedException(){
        super("You are under age");
    }
    UnderAgeCheckedException(String msg){
        super(msg);
    }
}
class Voting{
    public static void main(String[] args) {
        System.out.print("Enter yor age: ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();

        try{
            if (age < 18){
                throw new UnderAgeCheckedException();
            }else{
                System.out.println("Ypu can vote now!");
            }
        }catch (UnderAgeCheckedException e){
            e.printStackTrace();
        }
    }
}
