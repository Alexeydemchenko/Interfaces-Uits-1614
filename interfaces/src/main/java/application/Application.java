package application;
import Classes.*;
import fruits.*;
import vegetables.*;
import interfaces.*;

import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Application {
//	static List<Plant> list = new ArrayList<Plant>();
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	static boolean flag = false;
	static int vegetablesCount;
	static int fruitsCount;
	
	public static String[] color = {
			"red",
			"yellow",
			"green"
	};
		
	public static void main(String[] args) {
		menu();

	}
		
	public static void menu() {
		boolean flag = true;
		Basket basket = new Basket();
		FoodProcessor fp = new FoodProcessor();
		Plant[] plant = new Plant[0];
		while(flag) {
			System.out.println("MENU:");
			System.out.println("1 - Создать корзину");
			System.out.println("2 - Достать все продукты");
			System.out.println("3 - Почистить продукты");
			int choice = sc.nextInt();
				switch(choice) {
					case 1:{
						basket = createBasket();
						plant = new Plant[basket.list.size()];
					}break;
					case 2:{
						plant = basket.extractAll(basket.list);
					}break;
					case 3:{
						System.out.println(fp.peellItems(plant));
					}break;
				}
		}
	}
	
//	public static Plant[] fillArr() {
//		
//	}
//	
	public static Basket createBasket() {
		Basket basket = new Basket();
		int pick;
		System.out.println("1 - Fruit");
		System.out.println("2 - Vegetable");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:{
				System.out.println("Сколько фруктов необходимо?");
				System.out.println("Введите 0, если сразу хотите перейти к овощам!");
				pick = sc.nextInt();
				if(pick != 0) {
					for(int i = 0; i < pick; i++) {
						basket.put(createFruit());
					}
				}
			}
			case 2:{
				System.out.println("Сколько овощей необходимо?");
				System.out.println("Введите 0, если овощи не нужны!");
				pick = sc.nextInt();
				if(pick != 0) {
					for(int i = 0; i < pick; i++) {
						basket.put(createVegetable());
					}
				}
			}break;
		}
		System.out.println("Ваша корзина заполнена!");
		return basket;
	}
	
//	public static void createFoodProcessor(Basket basket) {
//		FoodProcessor fp = new FoodProcessor();
//		for(Plant pl : basket.list) {
//			System.out.println(pl);
//			
//		}	
//	}
	
	public static Plant createFruit() {
		Plant fruit;
		System.out.println("1 - Banana");
		System.out.println("2 - Apple");
		System.out.println("3 - Orange");
		System.out.println("4 - Exit fruits");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:{
				fruit = new Banana();
				fruit.setName("Banana");
				fruit.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				fruit.setColor(color[rand.nextInt(color.length)]);
				return fruit;
			}
			case 2:{
				fruit = new Apple();
				fruit.setName("Apple");
				fruit.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				fruit.setColor(color[rand.nextInt(color.length)]);
				return fruit;
			}
			case 3:{
				fruit = new Orange();
				fruit.setName("Orange");
				fruit.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				fruit.setColor(color[rand.nextInt(color.length)]);
				return fruit;
			}
			default:{
				return null;
			}
		}
	}
	
	public static Plant createVegetable() {
		Plant vegetable;
		System.out.println("1 - Tomato");
		System.out.println("2 - Cucumber");
		System.out.println("3 - Pepper");
		int choice = sc.nextInt();
		switch(choice) {
			case 1:{
				vegetable = new Tomato();
				vegetable.setName("Tomato");
				vegetable.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				vegetable.setColor(color[rand.nextInt(color.length)]);
				return vegetable;
			}
			case 2:{
				vegetable = new Cucumber();
				vegetable.setName("Cucumber");
				vegetable.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				vegetable.setColor(color[rand.nextInt(color.length)]);
				return vegetable;
			}
			case 3:{
				vegetable = new Pepper();
				vegetable.setName("Pepper");
				vegetable.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				vegetable.setColor(color[rand.nextInt(color.length)]);
				return vegetable;
			}
			default:{
				return null;
			}
		}
	}
	
	}
	
	
