package oops_ExceptionHandling.throwsKeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
    void readFile() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("d:/abc.txt");
//        Statements.....
    }

    void saveFile() throws FileNotFoundException{
        String txt = "Rajshree";
        FileOutputStream fos = new FileOutputStream("d:/xyz.txt");
//        statements.....
    }


}

class Test{
    public static void main(String[] args) {
        ReadAndWrite rw = new ReadAndWrite();
        try{
            rw.readFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try {
            rw.saveFile();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }


        System.out.println("End of program");
    }

}
