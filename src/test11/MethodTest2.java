package test11;

public class MethodTest2 {

	static int buyLaptop(int money) {
		int price = 97;
		if(money<price) {
			System.out.println("장난하냐?");
			return -1;
		}
		System.out.println("드디어 노트북을 하나 샀네영");
		return money-price;
	}
	public static void main(String[] args) {
		int wallet = buyLaptop(50);
		
		if(wallet==-1) {
			wallet = buyLaptop(75);
			if(wallet==-1) {
				wallet = buyLaptop(100);
			}
		}
		
		System.out.println("노트북사고 난 거스름돈 : "+ wallet);
	}
}
