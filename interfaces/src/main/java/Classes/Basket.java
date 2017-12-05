package Classes;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
	
	public List<Plant> list = new ArrayList<Plant>();
	
	public void put(Plant plant) {
		list.add(plant);
	}
	
	public void put(List<Plant> plant) {
		list.addAll(plant);
	}
	
	public void put(List<Plant> plant, Basket srcBasket) {
		for(Plant p : plant) {
			srcBasket.list.add(p);
		}
	}

	public Plant extractIndex(List<Plant> list, int index) {
		return list.get(index);
	}
	
//	public void extractAll(List<Plant> list) {
//		if(list.size() != 0) {
//			for(Plant plant : list) {
//				System.out.println(plant);
//			}
//			list.removeAll(list);
//		}else {
//			System.out.println("EMPTY BASKET");
//		}
//	}
	
	public Plant extractAllFruits(List<Plant> list) {
		for(Plant plant : list) {
			if(plant instanceof Fruit) {
				System.out.println(plant);
			}
		}
		return null;
	}
	
	public Plant extractAllVegetables(List<Plant> list) {
		for(Plant plant : list) {
			if(plant instanceof Vegetable) {
				System.out.println(plant);
			}
		}
		return null;
	}
	
	public double getBasketWeight(List<Plant> list) {
		double result = 0.0;
		for(Plant plant : list) {
			result = result + plant.getWeight();
		}
		return result;
	}
	
	
	public Plant[] extractAll(List<Plant> list) {
		if(list.size() == 0) {
			System.out.println("ВАША КОРЗИНА ПУСТА!");
			return null;
		}
		Plant[] plant = list.toArray(new Plant[list.size()]);
		list.removeAll(list);
		System.out.println(Arrays.toString(plant));
		return plant;
	}
	
	
	
}
