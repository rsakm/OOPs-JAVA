package oops_staticKeyword.staticVariable;

public class Employee {
//    //static variable is mainly used for memory management

    int empId;
    String name;
    String company = "AKMGOE";   /// As the company name is same for all objects, so there is no need to create the variable seperately for all objects, instaed we can declare it as static meaning common for all objects

    Employee(String name, int empId){
        this.empId = empId;
        this.name= name;
    }
    void display(){
        System.out.println(empId+" "+name+" "+company);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Raj", 01);
        e1.display();
        Employee e2 = new Employee("Shivam", 02);
        e2.display();

    }



}
