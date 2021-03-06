package aiproject3;


public class BoardState {

	int[][] board;
	Integer winner;
	
	BoardState(String[] strings){
		this.board = new int[7][6];
		for (int i=0; i<strings.length-1; i++){
			int x = (i/6);
			int y = i%6;
			this.board[x][y] = Integer.valueOf(strings[i]);
		}
		this.winner = Integer.valueOf(strings[42]);
		new BoardPrinter(this);
	}
	
}
