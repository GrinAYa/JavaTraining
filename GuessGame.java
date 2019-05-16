import java.util.ArrayList;
public class GuessGame {
	private ArrayList<Player> players = new ArrayList<Player>();
	
	public void addPlayer(Player player){
		players.add(player);
	}
	
	public void startGame(){
		int targetNumber = 0;
		int number = 0;
		boolean guess = false;
		targetNumber = (int)(Math.random()*10);
		System.out.println("Загадано число: " + targetNumber);
		
		while (!guess){
			for (Player player : players){
				number = player.guess();
				System.out.println (player.getName() + " предположил число: " + number);
				if (number == targetNumber) {
					System.out.println(player.getName() + " угадал число " + number);
					guess = true;
				}
			}
		}
		System.out.println("Игра окончена!!!");
	}
}