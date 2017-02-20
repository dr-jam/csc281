package Animals;

public class BasicAnimal {
  public String sound;

  public BasicAnimal(){
    this.sound = "Generic animal noise";
  }

  public void makeNoise(){
    System.out.println(sound);
  }


}
