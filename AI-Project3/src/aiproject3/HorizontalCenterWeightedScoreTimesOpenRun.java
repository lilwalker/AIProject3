package aiproject3;

public class HorizontalCenterWeightedScoreTimesOpenRun implements Feature {

	@Override
	public String calculate(BoardState state) {
		return Integer.toString(Integer.parseInt(new HorizontalCenterWeightedScore().calculate(state)) * Integer.parseInt(new OpenRun().calculate(state)));
	}

	@Override
	public String featureName() {
		return "HorizontalCenterWeightedScoreTimesOpenRunBonusPointsYay";
	}

}
