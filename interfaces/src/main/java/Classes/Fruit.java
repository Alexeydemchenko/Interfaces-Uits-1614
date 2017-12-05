package Classes;

import interfaces.Peellable;

public abstract class Fruit extends Plant implements Peellable {
	
	public static String type = "fruit";
	
	public Fruit() {
		
	}
	
	public Fruit(String name, double weight, String color, int freshness, boolean clearCondition) {
		super(name, weight, color, freshness, clearCondition);
	}
	
	public double peel() {
		double weight = this.getWeight();
		double result = weight * 0.98;
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nType: " + type + "\n";
	}

}
