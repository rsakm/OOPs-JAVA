package oops_objectCloning;

public class MAin {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human raj = new Human(21,"Rajshree");
        Human copy = new Human(raj);


        Human clone = (Human) raj.clone();
    }
}
