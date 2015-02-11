package aiproject3;

public class HighestPiece implements Feature {

    @Override
    public String calculate(BoardState state) {
        int player1Highest = 0;
        int player2Highest = 0;
        
        for (int x = 0; x < 7; x++) {
            for (int y = 0; y < 6; y++) {
                if (state.board[x][y] == 1) {
                    if (y > player1Highest) player1Highest = y;
                } else if (state.board[x][y] == 2) {
                    if (y > player2Highest) player2Highest = y;
                }
            }
        }
        
        return (player1Highest == player2Highest) ? "Neither" : ((player1Highest > player2Highest) ? "Player1" : "Player2");
    }

    @Override
    public String featureName() {
        // TODO Auto-generated method stub
        return "HeighestPiece";
    }

}
