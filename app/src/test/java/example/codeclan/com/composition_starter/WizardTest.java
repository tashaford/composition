package example.codeclan.com.composition_starter;

import android.support.v4.content.LocalBroadcastManager;
import android.support.v4.media.MediaBrowserServiceCompat;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WizardTest {

  Wizard wizard;
  Broomstick broomstick;
  Dragon dragon;

  @Before
  public void before(){
    broomstick = new Broomstick("Nimbus", 10);
    dragon = new Dragon("Errol");
    wizard = new Wizard("Toby", broomstick, dragon);

  }

  @Test
  public void hasName(){
    assertEquals("Toby", wizard.getName());
  }

  @Test
  public void hasBroomstick(){
    Broomstick ride = (Broomstick) wizard.getRide();
    assertEquals("Nimbus", ride.getBrand());
  }

  @Test
  public void canFly(){
    assertEquals("mounting broom, running, skipping, flying!",wizard.fly());
  }

  @Test
  public void canFlyDragon(){
    Dragon dragon = new Dragon("Smaug");
    wizard = new Wizard("Barry", dragon, dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canFlyMagicCarpet(){
    MagicCarpet magicCarpet = new MagicCarpet("Carpet");
    wizard = new Wizard("John", magicCarpet, dragon);
    assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
  }

  @Test
  public void canSetRide(){
    Dragon dragon = new Dragon("Norbert");
    wizard.setRide(dragon);
    assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
  }

  @Test
  public void canUseDragon(){
    assertEquals("Uses fire!", wizard.attack());
  }

}