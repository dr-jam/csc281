

import java.util.LinkedList;
import java.util.List;

import plants.*;

public class Garden {

  public static void main(String[] args) {
    // TODO Auto-generated constructor stub
    List<Plant> plants = new LinkedList<Plant>();
    
    int daysToGrow = 60;
    
    int strawberryCount = 10;
    int flowerCount = 15;
    int plantTypeCount;
    
    for(plantTypeCount = 0; plantTypeCount < strawberryCount; ++plantTypeCount) {
      plants.add(new Strawberry());
    }
    
    for(plantTypeCount = 0; plantTypeCount < flowerCount; ++plantTypeCount) {
      plants.add(new Flower());
    }
    
    for(Plant toPlant : plants) {
      toPlant.plantSeed();
    }
    
    int totalYield = 0;
    
    for(int currentDay=0; currentDay < daysToGrow; ++currentDay){
      for(Plant plant : plants) {
        if(plant.isFullGrown()) {
          totalYield = plant.harvest();
        }
        plant.grow(1);
      }
    }
    
  }

}
