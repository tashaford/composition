package example.codeclan.com.composition_starter;

import behaviours.Defender;
import behaviours.Flyable;

public class Dragon extends MythicalBeast implements Flyable, Defender{

  public Dragon(String name){
    super(name);
  }

  public String fly(){
    return "Standing up tall, beating wings, lift off!";
  }

  public String attack(){
    return "Uses fire!";
  }

}