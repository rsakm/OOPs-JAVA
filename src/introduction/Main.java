package introduction;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Store 5 roll Numbers
        int[] rolls = new int[5];

        //Store 5 names
        String[] names = new String[5];

        //data of 5 students:{ roll,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        // Create your own data types------> Class: A named group of properties and functions. It is a template of objects
        Student[] students = new Student[5];
        System.out.println(Arrays.toString(students));

        Student raj;   //raj has rno,name,marks as properties ---> Object: An instance of a class
//        raj = new Student();

        Student rajshree = new Student();
        System.out.println(rajshree);
        System.out.println(rajshree.marks);


        rajshree.marks= 94;
        System.out.println(rajshree.marks);


    }

//    class --------> Logical construct
//    object -------> Physical reality  : occupies space in the memory
//    state of the object, identity of the object, behaviour of the object
    
}

//    create a class
class Student{
    int rno;
    String name;
    float marks;
}



