package aiproject3;
import java.io.IOException;
import java.util.ArrayList;


public class FeatureApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		String infile = "DataFiles/trainingcsv.csv";
		
		if (args.length > 0) {
			infile = args[0];
		}
		String outfile = "trainingcsvout.csv";

		Reader reader = new Reader(outfile);
		ArrayList<Feature> features = new ArrayList<Feature>();
		features.add(new CenterTokens());
		//features.add(new PlayerTurn());
		//features.add(new TwoAndThree());
		features.add(new HorizontalCenterWeightedScore());
		features.add(new HighestPiece());
		//features.add(new NumberOfTotalPieces());
		features.add(new OpenRun());
		features.add(new OpenFirstLevel());
		features.add(new HorizontalCenterWeightedScoreTimesOpenRun());
		reader.calculateTestDataRange(infile, 0,1000,features);
	}

}
