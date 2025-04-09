package oops_ExceptionHandling;

import java.io.FileInputStream;

public class CheckedExceptions {
    public static void main(String[] args) {
//        FileInputStream fis = new FileInputStream("d:/abc.txt");  //// compile time checking, Unhandled exception error, program doesn't compile
        try {
            FileInputStream fis = new FileInputStream("d:/abc.txt");
            Class.forName("com.mysql.jdbc.Driver");
        }catch (Exception e){
            System.out.println("Exception occurred: " + e.getMessage());
            e.printStackTrace(); // Optional: prints the full stack trace
        }

    }
}
