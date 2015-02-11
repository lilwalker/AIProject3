package aiproject3;

public class HorizontalCenterWeightedScore implements Feature {

    @Override
    public String calculate(BoardState state) {
        int player1Score = 0;
        int player2Score = 0;
        
        for (int x = 0; x < 7; x++) {
            int score = 7 - 2*Math.abs(x - 3); // 1 3 5 7 5 3 1
            for (int y = 0; y < 6; y++) {
                if (state.board[x][y] == 1) {
                    player1Score += score;
                } else if (state.board[x][y] == 2) {
                    player2Score += score;
                }
            }
        }
        
        return Integer.toString(player1Score - player2Score);
    }

    @Override
    public String featureName() {
        return "HorizontalWeightedScore";
    }

}
