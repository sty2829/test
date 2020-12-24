package test20;

class Food {
	String name;
}

public class ArrayTest3 {

	public static void main(String[] args) {
		Food[] foods = new Food[2];
		System.out.println(foods[0]);
		foods[0] = new Food();
		System.out.println(foods[0]);
		foods[1] = new Food();
		foods[0].name = "볶음밥";
		foods[1].name = "짜장면";
		
		Food[] tmpFoods = foods;
		foods = new Food[3];
		System.out.println(foods[0]);
		for(int i=0; i<tmpFoods.length; i++) {

			foods[i] = tmpFoods[i];
		}
		foods[2] = new Food();
		foods[2].name = "짬뽕";
		
		tmpFoods = foods;
		foods = new Food[4];
		for(int i=0; i<tmpFoods.length;i++) {
			foods[i] = tmpFoods[i];
		}
		
		foods[3] = new Food();
		foods[3].name = "탕수육";		
		
		for(int i=0; i<foods.length; i++) {
			System.out.println(foods[i].name);
		}
	}
}
