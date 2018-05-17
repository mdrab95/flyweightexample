import jdk.nashorn.internal.ir.annotations.Immutable;


/**
 * Created by Ace on 17.05.2018.
 */
@Immutable
public class Car implements Vehicle {

    private Engine engine;

    private String color;

    public Car(Engine engine, String color){
        this.engine = engine;
        this.color = color;
        System.out.println("Building a new car takes a lot of time!");
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e){
            System.out.println("Error while creating a new car" + e.getMessage());
        }
    }

    @Override
    public void start(){
        System.out.println("Turning the key in the ignition.");
        engine.start();
    }

    @Override
    public void stop(){
        System.out.println("Turning the key in the ignition.");
        engine.stop();
    }

    @Override
    public String getColor(){
        return this.color;
    }

}
