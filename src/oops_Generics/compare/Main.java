package oops_Generics.compare;

public class Main {
    public static void main(String[] args) {
        Student raj = new Student(4,98.0f);
        Student priyaranjana = new Student(16,67.89f);

        if(priyaranjana.compareTo(raj) > 0){
            System.out.println("Priyaranjana has more marks");
        }else{
            System.out.println("Raj has more marks");
        }


    }
}
