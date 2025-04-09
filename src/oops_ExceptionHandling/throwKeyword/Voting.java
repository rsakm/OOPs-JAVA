package oops_ExceptionHandling.throwKeyword;

import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        try {
            if (age < 18) {
                throw new YoungAgeException("Not eligible");
            } else {
                System.out.println("You can vote now!");
            }
        }catch (YoungAgeException e){
//            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("End of program!!");
    }
}
