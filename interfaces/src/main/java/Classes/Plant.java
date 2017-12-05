package Classes;

import interfaces.Peellable;

public abstract class Plant implements Peellable {
	private String name;
	private double weight;
	private String color;
	private int freshness;
	private boolean clearCondition = false;
	private static int objCount;
	
	Plant(){
		objCount++;
	}
	
	Plant(String name, double weight, String color, int freshness, boolean clearCondition){
		this.name = name;
		this.weight = weight;
		this.color = color;
		this.freshness = freshness;
		this.clearCondition = clearCondition;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getFreshness() {
		return freshness;
	}
	
	public void setFreshness(int freshness) {
		this.freshness = freshness;
	}
	
	public boolean getClearCondition() {
		return clearCondition;
	}
	
	public void setClearCondition(boolean clearCondition) {
		this.clearCondition = clearCondition;
	}
	
	@Override
	public String toString() {
		return "Plant:\n" + "Name: " + name + "\nWeight: " + weight + "\nColor: " + color +
				"\nFreshness: " + freshness + "\nPeeled condition: " + clearCondition + "\nIndex: "
				+ objCount;
	}
	

}
