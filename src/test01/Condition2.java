package test01;

public class Condition2 {
	
	public static void main(String[] args) {
		int a = 99;
		if(a<100) {
			System.out.println("a는 100보다 작네요");
		}else if(a>100) {
			System.out.println("a는 100보다 크네요");
		}else {
			System.out.println("a는 100이였군!!!");
		}
		
		int b = 110;
		int c = 11;
		
		if(b<100) {
			if(c<100) {
				System.out.println("a,b는 모두 100보다 작군요");
			}
		}
		
		if(b<100 || c<100) {
			System.out.println("a또는 b가 100보다 작습니다.");
		}
		
	}	
}
