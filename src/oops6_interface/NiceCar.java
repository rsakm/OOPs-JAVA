package oops6_interface;

public class NiceCar {

    private Engine engine;  /// nice car has its own type of engine
    private Media mediaPlayer = new CdPlayer();

    public NiceCar(){
        engine = new PowerEngine();   //// By default it is a powerEngine
    }
//
//    private NiceCar(Engine engine){
//        this.engine = engine;
//    }

    public  void start(){
        engine.start();
    }

    public void acc(){
        engine.acc();
    }

    public void stop(){
        engine.stop();
    }

    public void startMusic(){
        mediaPlayer.start();
    }

    public void stopMusic(){
        mediaPlayer.stop();
    }

    public void upgradeEngine(){
        this.engine = new ElectricEngine();
        System.out.println("Car engine is ElectricEngine");
    }

}
