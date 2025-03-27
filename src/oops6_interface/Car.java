package oops6_interface;

public class Car implements Engine, Break, Media{

    @Override
    public void brake() {
        System.out.println("I implement disc brake");
    }

    @Override
    public void start() {

        System.out.println("I start like a normal car");

    }

    @Override
    public void stop() {
        System.out.println("I stop like a normal car");

    }

    @Override
    public void acc() {
        System.out.println("I accelerate like a normal car");
    }



}
