class GameLauncher{
	public static void main(String[] args){
		System.out.println("���� � ���������� �����.");
		System.out.println("��������� ���������� �����,");
		System.out.println("������ (���������) �� ������� �������� �������.");
		GuessGame game = new GuessGame();
		for (int i=1; i<4; i++){
			Player player = new Player("����� ����� " + i);
			System.out.println("�������� " + player.getName());
			game.addPlayer(player);
		}
		game.startGame();
	}
}