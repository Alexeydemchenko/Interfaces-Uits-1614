package Classes;

import interfaces.Peellable;

public abstract class Vegetable extends Plant implements Peellable {
	
	public static String type = "vegetable";
	
	public Vegetable() {
		
	}
	
	public Vegetable(String name, double weight, String color, int freshness, boolean clearCondition) {
		super(name, weight, color, freshness, clearCondition);
	}
	
	public double peel() {
		double weight = this.getWeight();
		double result = weight * 0.95;
		this.setClearCondition(true);
		return result;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\nType: " + type + "\n";
	}

}
