
public class CenterTokens implements Feature {
	
	CenterTokens(){	}

	@Override
	public String calculate(BoardState state) {
		int player1Centers = 0;
		int player2Centers = 0;
		for (int i = 0; i < 6; i++){
			if (state.board[4][i] == 1)
				player1Centers++;
			if (state.board[4][i] == 2)
				player2Centers++;
		}
		return String.valueOf(player1Centers-player2Centers);
	}
	
	public String featureName(){
		return "CenterTokens";
	}

}
