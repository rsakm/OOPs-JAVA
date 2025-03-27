package oops_Generics.compare;

public class Student implements Comparable<Student>{
    int rollNo;
    float marks;

    public Student(int roll, float marks){
        this.rollNo = roll;
        this.marks = marks;
    }


    @Override
    public int compareTo(Student o) {

        int diff = (int)(this.marks - o.marks);
        return diff;
    }
}
