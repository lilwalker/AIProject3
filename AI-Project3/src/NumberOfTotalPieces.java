
public class NumberOfTotalPieces implements Feature {

    @Override
    public String calculate(BoardState state) {
        int player1Score = 0;
        int player2Score = 0;
        
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 6; y++) {
                if (state.board[x][y] == 1) {
                    player1Score ++;
                } else if (state.board[x][y] == 2) {
                    player2Score ++;
                }
            }
        }
        
        return Integer.toString(player1Score - player2Score);
    }

    @Override
    public String featureName() {
        return "NumPieces";
    }

}
