package plants;

import java.util.LinkedList;
import java.util.List;

abstract public class Plant{

  public static List<String> growthLog;
  private static int idCount;
  
  static {    
    growthLog = new LinkedList<String>();
    idCount = 0;
  }
  
  protected int id;
  protected int daysSincePlanted;
  protected boolean isSprout;
  protected boolean isFullGrown;
  protected boolean isHarvested;
  
  public Plant() {
    this.id = Plant.idCount++;
    this.daysSincePlanted = 0;
    this.isSprout = false;
    this.isFullGrown = false;
    this.isHarvested = false;
  }

  abstract public void plantSeed();
  
  abstract public void grow(int days);
  
  abstract public boolean isSprout();
  
  abstract public boolean isFullGrown();
  
  //int is the "yield" of the plant
  abstract public int harvest();
}
