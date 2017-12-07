package Classes;
import interfaces.*;
import Classes.Plant;

public class FoodProcessor implements Cutter, Peeller, Slicer {
	
	private static double productsWeight;
	
	public double peellItem(Plant plant) {
        double result = plant.getWeight() - (0.2 * plant.getWeight());
           return result;
   }

	public double peellItems(Plant[] plant) {
		for(int i = 0; i < plant.length; i++) {
			productsWeight = productsWeight + plant[i].getWeight();
		}
		productsWeight = productsWeight - (productsWeight * 0.2);
		return productsWeight;
	}
	
	public double cutItem(Plant plant) {
        double result = plant.getWeight() - (0.01 * plant.getWeight());
           return result;
   }

	public double cutItems(Plant[] plant) {
		productsWeight = productsWeight - (productsWeight * 0.01);
		return productsWeight;
	}
	
	public double sliceItem(Plant plant) {
        double result = plant.getWeight() - (0.01 * plant.getWeight());
           return result;
   }

	public double sliceItems(Plant[] plant) {
		productsWeight = productsWeight - (productsWeight * 0.01);
		return productsWeight;
	}
	
	public double getProductsWeight() {
		return productsWeight;
	}
	
	public void setProductsWeight(double productsWeight) {
		this.productsWeight = productsWeight;
	}
	
}
