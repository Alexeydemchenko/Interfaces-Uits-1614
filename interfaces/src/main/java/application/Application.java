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
	static Random rand = new Random();
	static Scanner sc = new Scanner(System.in);
	static boolean flag = false;
	static int vegetablesCount;
	static int fruitsCount;
	static int index;
	static double basketWeight = 0.0;
	
	public static String[] color = {
			"red",
			"yellow",
			"green"
	};
		
	public static void main(String[] args) throws IllegalArgumentException, NullPointerException {
		menu();
	}
		
	public static void menu() throws IllegalArgumentException, NullPointerException {
		boolean flag = true;
		Basket basket = new Basket();
		FoodProcessor fp = new FoodProcessor();
		Plant[] plant = new Plant[0];
		while(flag) {
			menuPanel();
			int choice = sc.nextInt();
			if(choice >= 1 && choice <= 7) {
				switch(choice) {
				case 1:{
					basket = createBasket();
					plant = new Plant[basket.list.size()];
				}break;
				case 2:{
					plant = basket.extractAll(basket.list);
					basketWeight = 0.0;
				}break;
				case 3:{
					peelInFoodProcessor(fp, plant);
				}break;
				case 4:{
					cutInFoodProcessor(fp, plant);
				}break;
				case 5:{
					sliceInFoodProcessor(fp, plant);
				}break;
				case 6:{
					System.out.println("Вес Вашей корзины составляет: " + basketWeight);
				}break;
				case 7:{
					System.out.println("Goodbye!!!");
					flag = false;
				}break;
			}
		}else {
			System.out.println("Введены неправильные данные!");
		}
	}
}
	
	public static void menuPanel() {
		System.out.println("MENU:");
		System.out.println("1 - Создать корзину");
		System.out.println("2 - Достать все продукты");
		System.out.println("3 - Почистить продукты");
		System.out.println("4 - Нарезать продукты");
		System.out.println("5 - Нашинковать продукты");
		System.out.println("6 - Вес корзины");
		System.out.println("7 - Выйти из приложения");
	}
	
	public static Basket createBasket() {
		Basket basket = new Basket();
		int pick;
		System.out.println("1 - Фрукты");
		System.out.println("2 - Овощи");
		System.out.println("3 - Выйти в главное меню");
		int choice = sc.nextInt();
		boolean flag = true;
		while(flag) {
			if(choice >= 1 && choice <= 2) {
				pickPlant(basket, choice);
				flag = false;
			}else if(choice == 3) {
				System.out.println("Выход в главное меню!");
				break;
			}else {
				System.out.println("Введены неправильные данные!");
			}
		}
		basketFillStatus(basket);
		return basket;
	}
	
	public static void fruitsAmount(Basket basket, int pick) {
		if(pick != 0) {
			for(int i = 0; i < pick; i++) {
				basket.put(createFruit());
			}
		}
	}
	
	public static void vegetablesAmount(Basket basket, int pick) {
		if(pick != 0) {
			for(int i = 0; i < pick; i++) {
				basket.put(createVegetable());
			}
		}
	}
	
	public static void basketFillStatus(Basket basket) {
		if(basket.list.size() != 0) {
			System.out.println("Ваша корзина заполнена");
		}
	}
	
	public static void pickPlant(Basket basket, int choice) {
		int pick;
		switch(choice) {
			case 1:{
				System.out.println("Сколько фруктов необходимо?");
				System.out.println("Введите 0, если сразу хотите перейти к овощам!");
				fruitsAmount(basket, pick = sc.nextInt());
			}
			case 2:{
				System.out.println("Сколько овощей необходимо?");
				System.out.println("Введите 0, если овощи не нужны!");
				vegetablesAmount(basket, pick = sc.nextInt());
			}break;
		}
	}
	
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
				fruit.setIndex(index++);
				fruit.setClearCondition(false);
				fruit.setFreshness((int)(Math.random() * 5));
				basketWeight = basketWeight + fruit.getWeight();
				return fruit;
			}
			case 2:{
				fruit = new Apple();
				fruit.setName("Apple");
				fruit.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				fruit.setColor(color[rand.nextInt(color.length)]);
				fruit.setClearCondition(false);
				basketWeight = basketWeight + fruit.getWeight();
				return fruit;
			}
			case 3:{
				fruit = new Orange();
				fruit.setName("Orange");
				fruit.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				fruit.setColor(color[rand.nextInt(color.length)]);
				fruit.setClearCondition(false);
				basketWeight = basketWeight + fruit.getWeight();
				return fruit;
			}
			case 4:{
				
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
				vegetable.setClearCondition(false);
				basketWeight = basketWeight + vegetable.getWeight();
				return vegetable;
			}
			case 2:{
				vegetable = new Cucumber();
				vegetable.setName("Cucumber");
				vegetable.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				vegetable.setColor(color[rand.nextInt(color.length)]);
				vegetable.setClearCondition(false);
				basketWeight = basketWeight + vegetable.getWeight();
				return vegetable;
			}
			case 3:{
				vegetable = new Pepper();
				vegetable.setName("Pepper");
				vegetable.setWeight(Math.round(rand.nextDouble() * 1000.0) / 1000.0);
				vegetable.setColor(color[rand.nextInt(color.length)]);
				vegetable.setClearCondition(false);
				basketWeight = basketWeight + vegetable.getWeight();
				return vegetable;
			}
			default:{
				return null;
			}
		}
	}
	
	public static void peelInFoodProcessor(FoodProcessor fp, Plant[] plant) 
			throws NullPointerException{
		try {
			if(plant.length == 0) {
				System.out.println("Сначала необходимо достать продукты из корзины!!!");
			}else {
				fp.setProductsWeight(fp.peellItems(plant));
				for(Plant obj : plant) {
					obj.setClearCondition(true);
				}
				String formattedString = String.format("%.3f", fp.getProductsWeight());
				System.out.println("Вес Ваших продуктов после чистки: " + formattedString);
			}
		}catch(NullPointerException e) {
			System.out.println("ДЛЯ ВЫПОЛНЕНИЯ ДАЛЬНЕЙШИХ ОПЕРАЦИЙ ДОСТАНЬТЕ ПРОДУКТЫ!");
		}
	}
	
	public static void cutInFoodProcessor(FoodProcessor fp, Plant[] plant) 
			throws IllegalArgumentException, NullPointerException{
		try {
			if(plant.length == 0) {
				System.out.println("Сначала необходимо достать продукты из корзины!!!");
			}else {
				for(int i = 0; i < plant.length; i++) {
					if(plant[i].getClearCondition() == false) {
						throw new IllegalArgumentException();
					}
				}
				fp.setProductsWeight(fp.cutItems(plant));
				String formattedString = String.format("%.3f", fp.getProductsWeight());
				System.out.println("Вес Ваших продуктов после нарезки: " + formattedString);
			}
		}catch(IllegalArgumentException ae) {
			System.out.println("ПРОДУКТЫ НЕ ОЧИЩЕНЫ! ПРОИЗВЕДИТЕ ЧИСТКУ!");
		}
		catch(NullPointerException e) {
			System.out.println("ДОСТАНЬТЕ ПРОДУКТЫ ИЗ КОРЗИНЫ И ПРОВЕДИТЕ ЧИСТКУ!");
		}
	}
	
	public static void sliceInFoodProcessor(FoodProcessor fp, Plant[] plant) 
			throws IllegalArgumentException, NullPointerException{
		try {
			if(plant.length == 0) {
				System.out.println("Сначала необходимо достать продукты из корзины!!!");
			}else {
				for(int i = 0; i < plant.length; i++) {
					if(plant[i].getClearCondition() == false) {
						throw new IllegalArgumentException();
					}
				}
				fp.setProductsWeight(fp.sliceItems(plant));
				String formattedString = String.format("%.3f", fp.getProductsWeight());
				System.out.println("Вес Ваших продуктов после шинковки: " + formattedString);
			}
		}catch(IllegalArgumentException ae) {
			System.out.println("ПРОДУКТЫ НЕ ОЧИЩЕНЫ! ПРОИЗВЕДИТЕ ЧИСТКУ!");
		}
		catch(NullPointerException e) {
			System.out.println("ДОСТАНЬТЕ ПРОДУКТЫ ИЗ КОРЗИНЫ И ПРОВЕДИТЕ ЧИСТКУ!");
		}
	}
	
	}
	
	
