package oops_objectCloning;

public class Human implements Cloneable{
    int age;
    String name;

    public Human(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Human(Human h){
        this.age = h.age;
        this.name = h.name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();

    }
}
