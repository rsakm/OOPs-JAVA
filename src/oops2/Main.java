package oops2;

public class Main {

    public static void main(String[] args) {

        Human raj = new Human(21,"Rajshree Maurya", 10000, false);
        System.out.println("Population when raj object was created: "+ raj.population);
        Human pj = new Human(21,"Priyaranjana Jha", 20000,false);
        System.out.println("Population when pj object was created: "+ pj.population);


    }
}
