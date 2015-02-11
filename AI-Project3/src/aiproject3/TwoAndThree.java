package aiproject3;

public class TwoAndThree implements Feature {

	@Override
	public String calculate(BoardState state) {
		int player1twos = 0;
		int player2twos = 0;
		int player1threes = 0;
		int player2threes = 0;
		int lastpiece = 0;
		int inrow = 1;
		//vertical
		for (int x = 0; x < 7; x++){
			lastpiece = 0;
			inrow = 1;
			for (int y = 0; y < 6; y++){
				if (state.board[x][y] == lastpiece){
					inrow++;
				}
				else{
					if (inrow == 2 && lastpiece == 1)
						player1twos++;
					if (inrow == 3 && lastpiece == 1)
						player1threes++;
					if (inrow == 2 && lastpiece == 2)
						player2twos++;
					if (inrow == 3 && lastpiece == 2)
						player2threes++;
					inrow = 1;
					lastpiece = state.board[x][y];
				}
			}
		}
		//System.out.println(player1twos+"  "+player1threes+"  "+player2twos+"  "+player2threes+"  ");
		//horizontal
		for (int y = 0; y < 6; y++){
			lastpiece = 0;
			inrow = 1;
			for (int x = 0; x < 7; x++){
				//System.out.println(x+"  "+y+"  "+inrow+"  "+lastpiece+"  ");
				if (state.board[x][y] == lastpiece){
					inrow++;
				}
				else{
					if (inrow == 2 && lastpiece == 1)
						player1twos++;
					if (inrow == 3 && lastpiece == 1)
						player1threes++;
					if (inrow == 2 && lastpiece == 2)
						player2twos++;
					if (inrow == 3 && lastpiece == 2)
						player2threes++;
					inrow = 1;
					lastpiece = state.board[x][y];
				}
			}
		}
		lastpiece = 0;
		inrow = 1;
		//System.out.println(player1twos+"  "+player1threes+"  "+player2twos+"  "+player2threes+"  ");
		//diagonals
		for (int i = 0; i < 3; i++){
			int x = 0;
			lastpiece = 0;
			inrow = 1;
			for (int y = i; y < 6; y++){
				if (state.board[x][y] == lastpiece)
					inrow++;
				else{
					if (inrow == 2 && lastpiece == 1)
						player1twos++;
					if (inrow == 3 && lastpiece == 1)
						player1threes++;
					if (inrow == 2 && lastpiece == 2)
						player2twos++;
					if (inrow == 3 && lastpiece == 2)
						player2threes++;
					inrow = 1;
					lastpiece = state.board[x][y];
				}
				x++;
			}
		}
		for (int i = 5; i > 2; i--){
			int x = 6;
			lastpiece = 0;
			inrow = 1;
			for (int y = i; y > 0; y--){
				if (state.board[x][y] == lastpiece)
					inrow++;
				else{
					if (inrow == 2 && lastpiece == 1)
						player1twos++;
					if (inrow == 3 && lastpiece == 1)
						player1threes++;
					if (inrow == 2 && lastpiece == 2)
						player2twos++;
					if (inrow == 3 && lastpiece == 2)
						player2threes++;
					inrow = 1;
					lastpiece = state.board[x][y];
				}
				x--;
			}
		}
		for (int i = 5; i > 2; i--){
			int x = 0;
			lastpiece = 0;
			inrow = 1;
			for (int y = i; y > 0; y--){
				if (state.board[x][y] == lastpiece)
					inrow++;
				else{
					if (inrow == 2 && lastpiece == 1)
						player1twos++;
					if (inrow == 3 && lastpiece == 1)
						player1threes++;
					if (inrow == 2 && lastpiece == 2)
						player2twos++;
					if (inrow == 3 && lastpiece == 2)
						player2threes++;
					inrow = 1;
					lastpiece = state.board[x][y];
				}
				x++;
			}
		}
		for (int i = 0; i < 3; i++){
			int x = 6;
			lastpiece = 0;
			inrow = 1;
			for (int y = i; y < 6; y++){
				if (state.board[x][y] == lastpiece)
					inrow++;
				else{
					if (inrow == 2 && lastpiece == 1)
						player1twos++;
					if (inrow == 3 && lastpiece == 1)
						player1threes++;
					if (inrow == 2 && lastpiece == 2)
						player2twos++;
					if (inrow == 3 && lastpiece == 2)
						player2threes++;
					inrow = 1;
					lastpiece = state.board[x][y];
				}
				x--;
			}
		}
		System.out.println(player1threes+"  "+player2threes);
		
		return Integer.toString(player1threes - player2threes);
	}

	@Override
	public String featureName() {
		return "TwoAndThree";
	}

}
