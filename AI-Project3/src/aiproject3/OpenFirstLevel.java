package aiproject3;

public class OpenFirstLevel implements Feature {

	@Override
	public String calculate(BoardState state) {
		
		int empty = 0;
		
		for (int x = 0; x < 7; x++){
			if (state.board[x][0]==0)
				empty++;
		}
		
		return Integer.toString(empty);
	}

	@Override
	public String featureName() {
		return "OpenFirstLevel";
	}

}
