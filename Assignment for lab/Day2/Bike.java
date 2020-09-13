package Day2;

public class Bike extends Cycle {
    String define_me(){
        return "a vehicle with pedals.";
    }

    Bike(){
System.out.println("Hello I am a Bike I am "+ define_me());
        String temp=define_me();
System.out.println("My ancestor is a cycle who is "+ temp );


}
}
