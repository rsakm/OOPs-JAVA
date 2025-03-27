package oops6_interface;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.acc();
        car.brake();
        car.stop();


//        // problem over interface----> the media stop function stops the car engine due to ambiguity or what ever.
        Media carMedia = new Car();
//        carMedia.stop(); //// As it display the car engine stop

//        // To resolve this issue, we need to create separate classes for these interfaces having same name of functions and type

        CdPlayer mediaPlayer = new CdPlayer();
        mediaPlayer.start();
        mediaPlayer.stop();


        NiceCar myCar = new NiceCar();
        myCar.start();
        myCar.startMusic();

        NiceCar myNewCar = new NiceCar();
        myNewCar.upgradeEngine();

    }
}
