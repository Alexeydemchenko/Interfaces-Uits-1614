package Classes;
import interfaces.*;
import Classes.Plant;
import java.util.List;
import java.util.ArrayList;

public class FoodProcessor implements Cutter, Peeller, Slicer {
	
	
	public double peellItem(Plant plant) {
        double result = plant.getWeight() - (0.2 * plant.getWeight());
           return result;
   }
	
//	public double peellItems(List<Plant> list) {
//		double weight = 0.0;
//		double result = 0.0;
//		for(Plant plant : list) {
//			if(!plant.getClearCondition()) {
//				new IllegalArgumentException();
//			}
//			weight = weight + plant.getWeight();
//			result = weight - (0.2 * weight);
//			plant.setClearCondition(true);
//		}
//		return result;
//	}
	
	public double peellItems(Plant[] plant) {
		double weight = 0.0;
		double result;
		for(int i = 0; i < plant.length; i++) {
			weight = weight + plant[i].getWeight();
		}
		result = weight - (weight * 0.2);
		return result;
	}
	
	public double cutItem(Plant plant) {
        double result = plant.getWeight() - (0.1 * plant.getWeight());
           return result;
   }
	
	public double cutItems(List<Plant> list) {
		double weight = 0.0;
		double result = 0.0;
		for(Plant plant : list) {
			if(!plant.getClearCondition()) {
				new IllegalArgumentException();
			}
			weight = weight + plant.getWeight();
			result = weight - (0.1 * weight);
			plant.setClearCondition(true);
		}
		return result;
	}

	public double sliceItem(Plant plant) {
        double result = plant.getWeight() - (0.2 * plant.getWeight());
           return result;
   }
	
	public double sliceItems(List<Plant> list) {
		double weight = 0.0;
		double result = 0.0;
		for(Plant plant : list) {
			if(!plant.getClearCondition()) {
				new IllegalArgumentException();
			}
			weight = weight + plant.getWeight();
			result = weight - (0.2 * weight);
			plant.setClearCondition(true);
		}
		return result;
	}
	
}
