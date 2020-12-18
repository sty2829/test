package test12;

public class Food {
	String name;
	int price;
	String type;
	
	void makeSomeHappy() {
		System.out.println(name + "(" + type + ")은 우리를 행복하게 해");
		System.out.println("하지만 " + price + "원 이라는 댓가를 치뤄야하지.");
	}
	int howMuch() {		
		return price;
	}
	String getType() {
		
		return type;
	}
	public static void main(String[] args) {
		Food food = new Food();
		food.name = "초밥";
		food.price = 30000;
		food.makeSomeHappy();
		food.type = "일식";
		
		System.out.println(food.howMuch() + "원... 비싸네..");
		System.out.println("아 이음식은 " + food.getType() + " 이구나~");
		
	}
}
