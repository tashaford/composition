package example.codeclan.com.composition_starter;

import behaviours.Defender;
import behaviours.Flyable;

public class Wizard implements Flyable, Defender {
  String name;
  private Flyable ride;
  private Defender defender;

  public Wizard(String name, Flyable ride, Defender defender){
    this.name = name;
    this.ride = ride;
    this.defender = defender;
  }

  public String getName(){
    return this.name;
  }

  public Flyable getRide(){
    return this.ride;
  }

  public String fly(){
    return this.ride.fly();
  }

  public void setRide(Flyable ride) {
    this.ride = ride;
  }


  public String attack() {
    return this.defender.attack();
  }


}