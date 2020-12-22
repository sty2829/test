package test17;

public class Excute {

	public static void main(String[] args) {
		CrazyArcade crazyArcade = new CrazyArcade();
//		crazyArcade.name = "크아";
//		crazyArcade.price = 0;
//		crazyArcade.genre = "캐쥬얼";
//		crazyArcade.vendor = "넥슨";
		Game game = new Game();
		game.name = "크아";
		game.price = 0;
		game.genre = "캐쥬얼";
		game.vendor = "넥슨";
		game.startGame();
		game.playing();
		game.endGame();
		
		
	}
}
