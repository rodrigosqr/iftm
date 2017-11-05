package strategy;

public class Client {
	private BaseFileParser baseFileParser;

	public Client(BaseFileParser baseFileParser) {
		this.baseFileParser = baseFileParser;
	}

	public void parseFile() {
		baseFileParser.parseFile();
	}
}