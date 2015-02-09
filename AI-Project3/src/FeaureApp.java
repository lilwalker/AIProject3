import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;


public class FeaureApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Reader reader = new Reader("DataFiles/trainingcsvout.csv");
		ArrayList<Feature> features = new ArrayList<Feature>();
		features.add(new CenterTokens());
		//features.add(new PlayerTurn());
		features.add(new TwoAndThree());
		reader.calculateTestDataRange(0,10,features);
	}

}
