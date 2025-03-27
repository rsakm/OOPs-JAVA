package oops6_interface;

public class PowerEngine implements Engine{

    @Override
    public void start() {
        System.out.println("PowerEngine starts");
    }

    @Override
    public void stop() {
        System.out.println("PowerEngine stops");
    }

    @Override
    public void acc() {
        System.out.println("PowerEngine accelerate");
    }
}
