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
    
    if(!this.isSprout && !this.isFullGrown && !this.isHarvested) {
      //seed to sprout
      if(Math.random() < (double)(this.daysSincePlanted / AVG_GERMINATION)) {
        this.isSprout = true;
      }
    }else if (this.isSprout){
      //sprout to full plant
      if(Math.random() < (double)(this.daysSincePlanted / AVG_MATURITY)) {
        this.isFullGrown = true;
        this.isSprout = false;
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
      return 1;
    }else{
      //not ready or already harvested.
      return 0;
    }
  }

  //Strawberry local methods
  
  
}
