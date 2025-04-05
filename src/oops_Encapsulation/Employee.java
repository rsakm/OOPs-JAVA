package oops_Encapsulation;

public class Employee {
    private int empId;

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }
}

class Company{
    public static void main(String[] args) {

        Employee e = new Employee();
        e.setEmpId(101);
        System.out.println(e.getEmpId());
    }

}