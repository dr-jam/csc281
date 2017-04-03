package plants;

public class Strawberry extends Plant {

  final static int AVG_GERMINATION = 10;
  final static int AVG_MATURITY = 42;
  
  public Strawberry() {
    super();
  }

  //methods from Plant
  @Override
  public void plantSeed() {
    Plant.growthLog.add("Strawberry " + this.id + " seed planted.");
  }

  
  @Override
  public void grow(int days) {
    this.daysSincePlanted += days;

    double random = Math.random();   
    System.out.println("random value for strawberry " + this.id + " for age " + this.daysSincePlanted + " is " + random);
 
    if(!this.isSprout && !this.isFullGrown && !this.isHarvested) {
      //seed to sprout
      if(random < (double)this.daysSincePlanted / (double)AVG_GERMINATION) {
        this.isSprout = true;
        Plant.growthLog.add("Strawberry " + this.id + " has sprouted at age" + this.daysSincePlanted);
      }
    }else if (this.isSprout){
      //sprout to full plant
      if(random < (double)this.daysSincePlanted / (double)AVG_MATURITY) {
        this.isFullGrown = true;
        this.isSprout = false;
        Plant.growthLog.add("Strawberry " + this.id + " is now fully grown at age " + this.daysSincePlanted);
      }
    }
    
    
  }

  @Override
  public boolean isSprout() {
    return this.isSprout;
  }

  @Override
  public boolean isFullGrown() {
    return this.isFullGrown;
  }

  @Override
  public int harvest() {
    if(this.isFullGrown) {
      this.isFullGrown = false;
      this.isHarvested = true;
      Plant.growthLog.add("Strawberry " + this.id + " has been harvested.");
      return 1;
    }else{
      //not ready or already harvested.
      return 0;
    }
  }

  //Strawberry local methods
  
  
}
