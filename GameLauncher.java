class GameLauncher{
	public static void main(String[] args){
		System.out.println("Игра в угадывание чисел.");
		System.out.println("Компьютер загадывает число,");
		System.out.println("игроки (компьютер) по очереди пытаются угадать.");
		GuessGame game = new GuessGame();
		for (int i=1; i<4; i++){
			Player player = new Player("Игрок номер " + i);
			System.out.println("Добавлен " + player.getName());
			game.addPlayer(player);
		}
		game.startGame();
	}
}