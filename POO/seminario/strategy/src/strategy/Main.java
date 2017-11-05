package strategy;

public class Main {
	public static void main(String args[]) {
		Client clientA = new Client(new XMLFileParser());
		clientA.parseFile();

		Client clientB = new Client(new CSVFileParser());
		clientB.parseFile();
	}
}
