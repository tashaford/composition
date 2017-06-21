package example.codeclan.com.composition_starter;

import behaviours.Defender;

public class Ogre extends MythicalBeast implements Defender{
  
  public Ogre(String name){
    super(name);
  }

  public String attack(){
    return "Kicks ass";
  }

}