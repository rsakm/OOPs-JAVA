package oops6_interface;

public class CdPlayer implements Media{

    @Override
    public void start() {
        System.out.println("I start the media player inside the car");
    }

    public void stop(){
        System.out.println("I stop the media player of the car");
    }
}
